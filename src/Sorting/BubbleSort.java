package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,65,98,54,21,32,98,7,54,21,32,65,87};
        System.out.println(Arrays.toString(bsort(arr)));
    }
    public static int[] bsort(int[] arr)
    {
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j< arr.length-1;j++)
            {
                if(arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }
        return arr;
    }
}
