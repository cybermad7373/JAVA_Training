package Patterns;

public class Pattern5 {
	public static void main(String[] args)
	{
		int num = 5;
		for(int i = 0,count = 0;i<=num;i++,count++)
		{
			
			for(int l = num;l>i;l--)
			{
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++)
			{
				if(i==num)
				{
					System.out.print("* ");
					continue;
				}
				if (j== 0 || j == count)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
