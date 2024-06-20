package Recursion;

public class SubSetSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,6,8,12};
        int target_sum = 12;
        findsub(arr,0,"",0,target_sum);

    }
    public static void findsub(int[] arr, int inx, String set, int sum_so_far, int tar)
    {
        if(tar == sum_so_far)
        {
            System.out.println(set);
            return;
        }
        if(inx == arr.length)
        {
            return;
        }
        if(sum_so_far>tar)
        {
            return;
        }
        findsub(arr, inx+1, set+arr[inx]+" ", sum_so_far+arr[inx], tar);
        findsub(arr, inx+1, set, sum_so_far, tar);

    }
}
