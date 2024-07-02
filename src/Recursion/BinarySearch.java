package Recursion;


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {32,32,54,685,4,12,0,6,7,6,16,2468,25,231,35,1,86};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int target = 231;
        System.out.println(BinarySearchrecursion(arr,0,arr.length-1,target));
        System.out.println(BinarySearchNorm(arr,target));

    }

    public static int  BinarySearchrecursion(int[] arr, int min, int max, int target){
        if(min > max)
            return -1;
        int mid = (min+max)/2;
        //System.out.println(arr[mid]==target);
        if(arr[mid] == target)
        {
            return mid;
        } else if(arr[mid] > target)
        {
            return BinarySearchrecursion(arr, min, mid-1, target);
        }else{
            return BinarySearchrecursion(arr, mid+1, max, target);
        }
    }

    public static int BinarySearchNorm(int[] arr,int tar )
    {
        int i =0;
        int min = 0,max = arr.length-1;
        int mid = (min+max)/2;
        while(tar!=arr[mid])
        {
            if(tar<arr[mid])
            {
                max = mid-1;
            }else{
                min = mid+1;
            }
            mid = (min+max)/2;
        }
return mid;
    }

}
