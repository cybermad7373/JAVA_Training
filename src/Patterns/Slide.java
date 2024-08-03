package Patterns;

public class Slide {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0;i<n;i++)
        {
            for(int j = n;j>=i;j--){
                System.out.print(" ");
            }
//            System.out.println("**********");
            for(int k = 0;k<n;k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
