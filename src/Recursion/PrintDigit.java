package Recursion;

public class PrintDigit {

    public static void Print(int num){
        String[] val = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};

        if(num < 10){
            System.out.print(val[num]);
            return;
        }

        Print(num / 10);
        System.out.print(" " + val[num % 10]);
    }

    public static void main(String[] args) {
        Print(219);
    }
}
