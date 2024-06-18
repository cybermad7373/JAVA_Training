package StringS;
import java.util.Arrays;
public class Anagram {

    public static String IsAnagram(String str1,String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()){
            return "Not Anagram";
        }
        char[] Arr1 = str1.toCharArray();
        char[] Arr2 = str2.toCharArray();

        Arrays.sort(Arr1);
        Arrays.sort(Arr2);
        


        if(Arr1 == Arr2)
        {
            return "Is Anagram";
        }else{
            return "NOt Anagram";
        }
    }

    // public static String IsAnagran(String str){

    // }



    public static void main(String[] args) {
        String str1 = "INTEGER";
        String str2 = "ITNGERE";
        System.out.println(IsAnagram(str1, str2));
    }
    
}
