package ArraysS;

class LinearSearch{

    public static int Linearsearch(int arr[],int num)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
             return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = {3,2,1,4,50};
        int x = 1;
        int value = Linearsearch(arr, x);
        System.out.println(value);
    }
}