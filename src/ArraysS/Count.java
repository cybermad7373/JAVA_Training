package ArraysS;

public class Count {
    public static int count(int arr[], int x)
    {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
             count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {12,13,18,10,1,1,8,5,1};
        int num = 1;
        System.out.println(count(arr, num));
        
    }
    
}
