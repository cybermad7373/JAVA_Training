package Patterns;

public class BlankDiamond {
    public static void main(String[] args) {
        int n = 11;
//        int h = n/2;
        for(int i = n/2,k=0;i>=0;i--,k++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            for(int l = 0;l<k*2;l++){
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1,k=n/2;i<=n/2;i++,k--){
            for(int j = 0;j<=i;j++)
                System.out.print("*");
            for(int j=k*2-2;j>0;j--)
                System.out.print(" ");
            for(int j = 0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

//
//        ************
//        *****  *****
//        ****    ****
//        ***      ***
//        **        **
//        *          *
//        **        **
//        ***      ***
//        ****    ****
//        *****  *****
//        ************
//