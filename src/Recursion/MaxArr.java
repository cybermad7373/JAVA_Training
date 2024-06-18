package Recursion;

public class MaxArr {
    static int max = 0;
    public static void Max(int[] arr, int inx){
        if(inx != -1)
        {
            Max(arr,inx-1);
            if(arr[inx]>max){
                max = arr[inx];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,60,56};
        Max(arr,arr.length-1);
        System.out.println(max);
    }
}
