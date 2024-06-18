package Patterns;
// import java.util.Scanner;
public class Pattern3 {
	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n = 5;
		for(int i =0 ; i<=n;i++)
		{
			int newn = i;
			
			for(int k =0;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j = n;j>i;j--)
			{
				System.out.print(++newn+ " ");
				
			}
			System.out.println();
		}
	}
}
