package Patterns;

public class Pattern4 {
	public static void main(String[] args)
	{
		int r=4,c=5;
		for(int i = 0 ;i<=r;i++)
		{
			for(int j = 0;j<=c;j++)
			{
				if(i==0 || i == r)
				{
					System.out.print('*');
					continue;
				}

				if(j==0 || j == c)
				{
					System.out.print('*');
					continue;
				}else {
					System.out.print(" ");
					continue;
				}
				
			}
			System.out.println();
		}
	}

}
