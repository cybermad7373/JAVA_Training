package Recursion;

public class DispArray {
    public static void dispAsc(int[] nums,int val){
      if(val != -1)
      {
          dispAsc(nums,val-1);
          System.out.println(nums[val]);
      }
    }

    public static void dispDes(int[] nums,int val){
        if(val != -1)
        {

            System.out.println(nums[val]);
            dispDes(nums,val-1);
        }
    }
    public static void main(String[] args) {
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        System.out.println("Assending :");
        dispAsc(intArray,intArray.length-1);
        System.out.println("Desending :");
        dispDes(intArray,intArray.length-1);


    }
}
