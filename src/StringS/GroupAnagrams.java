/*package StringS;

import java.util.Arrays;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Anagram groups: " + groupAnagrams(Arrays.toString(strs)));
    }

    private static String[][] groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new String[0][];
        }

        // Sort the words in the input array
        for (int i = 0; i < strs.length; i++) {
            Arrays.sort(strs[i].toCharArray());
        }

        // Group the sorted words into anagram groups
        String[][] groups = new String[strs.length][];
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            if (i == 0 || !isAnagram(strs[i], strs[i - 1])) {
                groups[count++] = new String[1];
                groups[count - 1][0] = strs[i];
            } else {
                groups[count - 1] = addToGroup(groups[count - 1], strs[i]);
            }
        }

        // Return the first count groups
        return Arrays.copyOf(groups, count);
    }

    private static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    private static String[] addToGroup(String[] group, String word) {
        String[] newGroup = new String[group.length + 1];
        System.arraycopy(group, 0, newGroup, 0, group.length);
        newGroup[group.length] = word;
        return newGroup;
    }
}
 */