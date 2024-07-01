package CollectionsS.StackS;
// in : 8 3 1 0 1 3 0 2
// op : 3 - 3 1 3 - 2 -

import java.util.Arrays;
import java.util.Stack;

public class nextBig {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }


            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        System.out.println(Arrays.toString(ans));
    }
}
