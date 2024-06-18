package Patterns;

public class Pattern6 {
  public static void main(String[] args) {
    int num = 7;
    
    for(int i =0;i<num;i++)
    {
      int count = i;
      
      for(int k = 0;k<i;k++)
      {
        System.out.print(" ");
      }
      for(int j=num;j>i;j--)
      {
        System.out.print(++count + " ");
      }
      System.out.println();
    }
    /////////////////////////
    int newn = num;
    for(int i =1;i<=num;i++)
    {
    	if(i==num)
    	{
    		break;
    	}
      newn = num-i;

      for(int k = num-1;k>i;k--)
      {
        System.out.print(" ");
      }
      for(int j=0;j<=i;j++)
      {
        System.out.print(newn++ + " ");
      }
      System.out.println();
    }
  }
}