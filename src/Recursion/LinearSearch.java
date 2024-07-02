package Recursion;

import java.util.Arrays;

public class LinearSearch
{
    public static void main(String[] args) {
        int[] arr = {12,32,45,65,78,98};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int target = 45;
        System.out.println(LinearSearchNorm(arr,target));
        System.out.println(LinearSearchRecursion(0,target,arr));

    }

    public static int LinearSearchRecursion(int pos,int target,int[]arr)
    {
        if(pos<arr.length) {
            if (target == arr[pos]) {
                return pos;
            } else {
               return LinearSearchRecursion(pos + 1, target, arr);
            }
        }
        return -1;
    }


    public static int LinearSearchNorm(int[] arr,int target)
    {
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
