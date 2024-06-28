package Problems;

public class FirstUnique {
    public static void main(String[] args) {
        String str1 = "aabcxghb";
        String str2 = "abcxchbag";

        System.out.println("Unique character of 1st string : " + findFirstUnique(str1));
        System.out.println("Unique character of 2nd string : " + findFirstUnique(str2));

        System.out.println("Unique of 1st string : " );
        first_unique();
        System.out.println("Unique of 2nd string : " );
        first_unique();
    }

    public static void first_unique() {

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
