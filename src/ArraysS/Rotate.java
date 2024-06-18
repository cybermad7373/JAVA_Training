package ArraysS;

public class Rotate {

    public static void Rotat(int[] num,int k){
        int n = num.length;
        reverse(num, 0, n-1);
        reverse(num, 0,k-1 );
        // reverse(num, 0, n-1);


    }

    public static void reverse (int[] arr,int start,int end){
        while (start<end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start ++;
            end--;
        }


    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int k=3;
        Rotat(arr, k);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
