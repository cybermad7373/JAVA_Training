package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainsPermutation {
    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "eidbaooo";
        String[] strr = str1.split("");
        int n = 2;
//        List<List<String>> ans = new ArrayList<>();
//        rec(ans, new ArrayList<>(), strr, n);
        System.out.println(check(str1,str2));
    }

    public static void rec(List<List<String>> ans, List<String> temp, String[] str, int n) {
        if (temp.size() == n) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (String ch : str) {
            if (temp.contains(ch))
                continue;
            temp.add(ch);
            rec(ans, temp, str, n);
            temp.remove(temp.size() - 1);
        }
    }
    public static boolean check(String str1,String str2){
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        for(int i =0;i<str1.length();i++)
        {
            f1[str1.charAt(i)-'a'] +=1;
        }
        for(int i =0;i<str2.length();i++)
        {
            f2[str2.charAt(i)-'a'] +=1;
        }
        int count = 0;
        for(int i = 0 ; i <26;i++){
            f1[i] = f1[i]-f2[i];
            if(f1[i]<=0)
                count++;
        }
//        System.out.println(Arrays.toString(f1));
//        System.out.println(Arrays.toString(f2));
        return count == 26;

    }
}
