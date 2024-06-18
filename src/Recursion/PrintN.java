package Recursion;

public class PrintN {
    public static void PrintInc(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        PrintInc(n-1);
        System.out.println(n);
    }
    public static void PrintDec(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintDec(n-1);


    }
    public static void main(String[] args) {
      PrintInc(5);
        System.out.println("/////////////////////");
      PrintDec( 5);
    }
}
