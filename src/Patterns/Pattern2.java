package Patterns;

public class Pattern2 {
	public static void main(String[] args)
	{
		int n = 4;
		//DIAMOND 
		
//		for(int i = 0 ;i< n;i++)
//		{
//			//for blank space
//			for(int j = n;j>=i;j--)
//			{
//				System.out.print(" ");
//				
//			}  
//			//for numbers
//			for(int k = 0;k<=i;k++)
//			{
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
		
		for(int l = 0 ;l<=n;l++)
		{
			//for blank space
			for(int m = 0;m<l;m++)
			{
				System.out.print(" ");
				
			}
			for(int r = n;r>=l;r--)
			{
				System.out.print('*'+ " ");
			}
			System.out.println();
			
		}

		
		// REVERSE DIAMOND
		
//		for(int i = 0 ;i< n;i++)
//		{
//			//for blank space
//			for(int j = 0;j<=i;j++)
//			{
//				System.out.print(" ");
//				
//			}  
//			//for numbers
//			for(int k = n;k>=i;k--)
//			{
//				System.out.print(count++ + " ");
//			}
//			System.out.println();
//		}
//		
//		for(int l = 0 ;l<=n;l++)
//		{
//			//for blank space
//			for(int m = n;m>l;m--)
//			{
//				System.out.print(" ");
//				
//			}
//			for(int r = 0;r<=l;r++)
//			{
//				System.out.print(count++ +" ");
//			}
//			System.out.println();
//			
//		}
		
		
		

	}

}
