/*package ArraysS;
// Merging sorted arrays
public class MergeArray {

    public static int[] MergeSortedArray(int[] arr,int n,int m){
        int i=0,j=0,k=0;
        int[] rev = new int[m+n];
        while(i<n && j<m){
            if(arr[i]<=arr[j])
            {
                rev[k]=arr[i];
                i++;
            }else{
                rev[k]=arr[j];
                j++;
            }
            
            k++;
        }
        return [-1];
        }
    public static void main(String[] args) {

        
    }
    
}
*/