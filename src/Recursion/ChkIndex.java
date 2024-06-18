package Recursion;

public class ChkIndex {
    public static void chkk(int[] arr, int val, int tar)
    {
        if(val!= -1)
        {
            chkk(arr,val-1,tar);
            if(tar==arr[val])
            {
                System.out.println(val+ " : 10");
            }
        }
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{ 10,20,10,30,10,50,60,1,90,40,10,50,60,10 };
        int target = 10;
        chkk(intArray, intArray.length - 1,target);
    }
}

