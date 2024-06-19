package Recursion;

import java.sql.SQLOutput;

public class SumArray {

    public static void summ(int[] arr,int target,String ans,int sum, int pos) {
        sum+=arr[pos];
        ans+=arr[pos];
        if(sum == target)
        {
            System.out.println(ans);
            return;
        }
        summ(arr,target,ans,sum,pos+1);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30};
        int target = 30;
        summ(arr,target,"",30,0      );
    }
}
