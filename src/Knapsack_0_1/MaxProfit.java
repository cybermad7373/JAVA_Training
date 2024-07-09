package Knapsack_0_1;

public class MaxProfit {
    public static void main(String[] args) {
        int[] values = {100, 50, 30, 25, 15};
        int[] weights = {10, 5, 2, 1, 1};
        int capacity = 50;

        int maxProfit = max_profit(values, weights, 0, 0, 0, capacity);
        System.out.println(maxProfit);
    }

    public static int max_profit(int[] values, int[] weights, int currentValue, int currentWeight, int index, int capacity) {
        if (index >= values.length || capacity <= 0) {
            return currentValue;
        }

        int profit1 = 0;
        if (currentWeight + weights[index] <= capacity) {
            profit1 = max_profit(values, weights, currentValue + values[index], currentWeight + weights[index], index + 1, capacity);
        }

        int profit2 = max_profit(values, weights, currentValue, currentWeight, index + 1, capacity);

        return Math.max(profit1, profit2);
    }
}
