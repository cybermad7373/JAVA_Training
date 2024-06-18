package ArraysS;
import java.util.Arrays;
import java.util.Scanner
;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row =sc.nextInt();
        int col =sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("enter element : ["+i+"]["+j+"] :");
                arr[i][j] = sc.nextInt();
            }
        } 
        for(int[] num : arr)
        {
            System.out.println(Arrays.toString(num));
        }
        sc.close();
    }
   
    
}
