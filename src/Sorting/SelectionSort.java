package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12,65,98,54,21,32,98,7,54,21,32,65,87};
        System.out.println(Arrays.toString(Ssort(arr)));
    }
    public static int[] Ssort(int[] arr) {

        for(int i =0,d=arr.length-1;i<arr.length;i++,d--)
        {
            int val = arr[0],p=0;
            for(int j =0;j<d;j++)
            {
                if(val < arr[j])
                {
                    val = arr[j];
                    p = j;
                }
            }
            int temp = arr[d];
            arr[d] = val;
            arr[p] = temp;

        }
        return arr;
    }

}
