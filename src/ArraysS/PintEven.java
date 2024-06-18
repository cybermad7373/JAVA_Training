package ArraysS;

public class PintEven {

    public static int Even(int arr[])
    {
        // int[] new_arr = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
          
            }
        }
        return 1;
    }
    public static void main(String[] args)
    {
        int[] array = new int[] { 3, 5, 2, 5, 14, 4 };
        Even(array);

    }
}
