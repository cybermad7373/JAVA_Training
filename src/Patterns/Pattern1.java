//		1
//		01
//		101
//		0101
//		10101
		

package Patterns;
import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(i%2==0)
				{
					if(j%2==0)
					{
						System.out.print("0");
					}
					else {
						System.out.print("1");
					}
				}
				else {
					if(j%2==0)
					{
						System.out.print("1");
					}
					else {
						System.out.print("0");
					}
					
				}
			}
			System.out.println();
		}
		/////////////////////////////////////////////////////////////
		;
		for(int i = 0;i<=n;i++)
		{
			int k = 1;
			if(i%2==0)
			{
				k = 0;
			}
			for(int j = 0;j<i;j++)
			{
				System.out.print(k);
				if(k==0)
				{
					k=1;
				}else {
					k=0;
				}
				
			}
			System.out.println();
		}
		
	sc.close();	
	}

}
