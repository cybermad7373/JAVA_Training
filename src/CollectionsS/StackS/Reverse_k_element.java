package CollectionsS.StackS;

import java.util.Arrays;
import java.util.Stack;

public class Reverse_k_element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int  k =8;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<k;i++)
        {
            stack.push(arr[i]);
        }
        for (int i = 0;i<k;i++){
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
