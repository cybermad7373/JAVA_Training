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


    public static void new_chk(int pos,int[] arr, int tar){
        if(pos!=arr.length) {
            new_chk(pos + 1, arr, tar);
            if (tar == arr[pos]) {
                System.out.println(pos);
                return;
            }


        }

    }

    public static void main(String[] args) {
        int[] intArray = new int[]{ 10,20,10,30,10,50,60,1,90,40,10,50,60,10 };
        int target = 10;
        chkk(intArray, intArray.length - 1,target);

        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-");
        new_chk(0,intArray,target);
    }
}

