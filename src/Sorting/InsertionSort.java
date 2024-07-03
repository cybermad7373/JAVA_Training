package Sorting;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12,65,98,54,21,32,98,7,54,21,32,65,87};
        //System.out.println(Arrays.toString(isort(arr)));
    }
    public static int[] isort(int[] arr)
    {
        int[] sorted = new int[arr.length];

        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]<arr[i+1])
            {
                continue;
            }else{
                int temp = arr[i];
            }
        }
return arr;
    }
}
