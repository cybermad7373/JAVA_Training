package Patterns;

import java.util.ArrayList;

public class LookAndSay {
    public static void main(String[] args) {
        int n = 7 ;
        String str = "1";
        System.out.println(str); // first term

        for(int i = 1; i < n; i++) {
            str = getNextTerm(str);
            System.out.println(str);
        }
    }


    public static String getNextTerm(String str) {
        StringBuilder nextTerm = new StringBuilder();
        int count = 1;

        for(int j = 1; j < str.length(); j++) {
            if(str.charAt(j) == str.charAt(j - 1)) {
                count++;
            } else {
                nextTerm.append(count).append(str.charAt(j - 1));
                count = 1;
            }
        }
        nextTerm.append(count).append(str.charAt(str.length() - 1)); // Append the last group

        return nextTerm.toString();
    }
}



//        1
//        11
//        21
//        1211
//        111221
//        312211
//        13112221