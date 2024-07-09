package GreedyApproach;
//   Input: arr[] = {{60, 10}, {100, 20}, {120, 30}}, W = 50
//   Output: 240

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class KnapSac {
    public static int maxProfit(int[][] arr)
    {
        int cost = 0;
        for (int[] i : arr)
        {
            System.out.println(Arrays.toString(i));
        }
        return cost;
    }
    public static void main(String[] args) {
    int[][] arr =  {{60, 10}, {100, 20}, {120, 30}};
        System.out.println(maxProfit(arr));
    }
}
