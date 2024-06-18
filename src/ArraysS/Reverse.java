package ArraysS;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int temp;
        for(int i = 0,j=arr.length-1; i<arr.length/2; i++,j--)
        {
            temp=arr[i];
            arr[i] =arr[j];
            arr[j] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
    
}
