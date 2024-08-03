package Practice;

public class LongestNonRepeatingSubstring {
    public static void main(String[] args) {
        String str = "absdab";

        System.out.println("Longest non-repeating substring: " +  fun(str, "", 0, 0));
    }

    public static String fun(String str, String ans, int start, int end) {
        if (end == str.length())
            return ans;

        String current = str.substring(start, end + 1);

        // Check if the current substring contains repeating characters
        if (hasUniqueCharacters(current)) {
            if (current.length() > ans.length()) {
                ans = current;
            }
            return fun(str, ans, start, end + 1);
        } else {
            return fun(str, ans, start + 1, end);
        }
    }

    public static boolean hasUniqueCharacters(String str) {
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }
}
