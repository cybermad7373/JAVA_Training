/*package Problems;

//Problem 1 SUbscripion = 6 persons
// 3
// 1 100 -> 100
// 2 250 -> 500
// 3 135 -> 405
//
import java.util.Scanner;
public class Subscription {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][2];
        for(int i = 0;i<num;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }        
        int q,r=0;
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < 2; j++) {
                q = arr[i][0] / 6;
                r = arr[i][0] % 6;
                if(r > 0) {
                    q++;
                }
                System.out.println(q * arr[i][1]); 
            }
        }
        
        
            
        }
    }
    
}
*/