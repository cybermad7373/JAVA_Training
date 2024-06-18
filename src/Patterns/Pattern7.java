package Patterns;
//     1
//    121
//   12321
//  1234321
// 123454321

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<=n;i++)
        {
            int j,temp=0;
            for(int l=n;l>i;l--)
            {
                System.out.print(" ");
            }
            for(j =1;j<=i;j++)
            {
                if(j<=i)
                {
                    System.out.print(j);
                }      
                         
            }
            temp=j-1;
            for (int k = 2; k <= i; k++) {
                System.out.print(--temp +"");
            }
           
            System.out.println();
        }
            
        }

        
    }