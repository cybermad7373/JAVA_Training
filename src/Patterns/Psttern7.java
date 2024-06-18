package Patterns;
// import java.
public class Psttern7 {

	public static void main(String[] args) {
		int num = 7;
		
		for(int i = 0,count = 0;i<=num;i++,count++)
		{
			
			for(int l = num;l>i;l--)
			{
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++)
			{
				if(i==0)
				{
					System.out.print("_");
					continue;
				}
				if(i==num)
				{
					System.out.print("__");
					continue;
				}
				if (j== 0 )
				{
					System.out.print("/ ");
				}
				else if(j==count){
					System.out.print("\\");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		int r = num ,c = num;
		
		for(int i = 0 ;i<=r;i++)
		{
			for(int j = 0;j<=c;j++)
			{
				if( i == r)
				{
					System.out.print("__");
					continue;
				}

				if(j==0 || j == c)
				{
					System.out.print("|");
					continue;
				}else {
					System.out.print("  ");
					continue;
				}
				
			}
			System.out.println();
		
		}
	}

}
