package StringS;

public class FirstOcc {
    public static void main(String[] args) {
        // String haystack = "sadbutsad";
        // String needle = "sad";

        String haystack = "leetcode";
        String needle = "leeto";

        System.out.println(haystack.indexOf(needle));
    }
}
/*Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
*/