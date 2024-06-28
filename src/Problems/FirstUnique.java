package Problems;

import java.util.LinkedList;
import java.util.Queue;

public class FirstUnique {
    public static void main(String[] args) {
        String str1 = "aabcxghb";
        String str2 = "abcxchbag";

        System.out.println("Unique character of 1st string : " + findFirstUnique(str1));
        System.out.println("Unique character of 2nd string : " + findFirstUnique(str2));

        System.out.print("Unique of 1st string : " );
        first_unique(str1);
        System.out.print("Unique of 2nd string : " );
        first_unique(str2);
    }

    public static void first_unique(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i= 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
        }
        while(!q.isEmpty() && freq[q.peek() - 'a']>1){
            q.remove();
        }
        if(q.isEmpty()){
            System.out.println("-1");
        }
        else {
            System.out.println(q.peek());
        }
    }

    public static char findFirstUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return currentChar;
            }
        }

        return 0;
    }
}
