package StringS;
import java.util.Scanner;
import java.util.Arrays;
public class ListAnagram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        String str = "eat tea tan ate nat bat";
        String[] arr =  str.split(" ");
        // System.out.println(Arrays.toString(arr));
        int[] size = new int[arr.length];
        int k =0; 
        for(String i : arr)
        {
            int temp=0;
            int[] tarr = new int[i.length()];
            for(int j = 0 ; j<i.length();j++)
            {
                tarr[j] = i.charAt(j);
                temp += tarr[j];
            }
            size[k] = temp; 
            k++; 
        }
        System.out.println(Arrays.toString(size));
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    
}
//  INP: eat tea tan ate nat bat
//  OUT: bat nat tan ate eat tea
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]