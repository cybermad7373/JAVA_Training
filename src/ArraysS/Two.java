package ArraysS;

import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the on od Rows");
        int l = sc.nextInt();
        System.out.println("Enter the on od Rows");
        int b = sc.nextInt();
        int[][] mat = new int[l][b];
        for(int i = 0;i<l;i++)
        {
            for(int j = 0;j<b;j++)
            {
                System.out.println("Enter the valu of position ["+i+"]["+j+"] : ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value to serch");
        int val = sc.nextInt();
        for(int i = 0;i<l;i++)
        {
            for(int j = 0;j<b;j++)
            {
                if(val == mat[i][j])
                {
                    System.out.println("The value is at  position ["+i+"]["+j+"] : ");
                }
            }
        }
        for(int[] i : mat)
        {
            for(int j : i)
            {
                System.out.print(j+ ' ');
            }
            System.out.println();
        }


    }
}
