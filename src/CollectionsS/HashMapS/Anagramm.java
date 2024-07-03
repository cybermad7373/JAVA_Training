package CollectionsS.HashMapS;

import java.util.HashMap;

public class Anagramm {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2  = "ngraaam";
        if(function(s1,s2)){
            System.out.println("Valid anagram");
        }
            else{
            System.out.println("not a valid anagram");
        }

    }
    public static boolean function(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (map.containsKey(ch)) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }

}



















