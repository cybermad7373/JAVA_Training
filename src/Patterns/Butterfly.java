package Patterns;

public class Butterfly {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            for(int j = n;j>=i*2-2;j--)
                System.out.print("  ");
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i = 0;i<n;i++)
        {
            for(int j = n;j>i;j--)
                System.out.print("* ");
            for(int j=0;j<i*2;j++)
                System.out.print("  ");
            for(int j = n;j>i;j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}

//        *                 *
//        * *             * *
//        * * *         * * *
//        * * * *     * * * *
//        * * * * * * * * * *
//        * * * * * * * * * *
//        * * * *     * * * *
//        * * *         * * *
//        * *             * *
//        *                 *