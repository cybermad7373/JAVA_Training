package Problems;

public class DialPadCombinations {
    public static void main(String[] args) {
        String nums = "234";
        function(nums);
    }

    public static void function(String str) {
        String[] dials = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        String str1 = "", str2 = "", str3 = "", str4 = "";

        if (str.length() >= 1) {
            str1 = dials[Integer.parseInt(String.valueOf(str.charAt(0))) ];
        }
        if (str.length() >= 2) {
            str2 = dials[Integer.parseInt(String.valueOf(str.charAt(1))) ];
        }
        if (str.length() >= 3) {
            str3 = dials[Integer.parseInt(String.valueOf(str.charAt(2))) ];
        }
        if (str.length() >= 4) {
            str4 = dials[Integer.parseInt(String.valueOf(str.charAt(3))) ];
        }

        if (str == null)
            return;

        if (str.length() == 1)
            System.out.println(dials[Integer.parseInt(str)]);
        else if (str.length() == 2)
            generateCombinations(str1, str2, "");
        else if (str.length() == 3)
            generateCombinations(str1, str2, str3, "");
        else if (str.length() == 4)
            generateCombinations(str1, str2, str3, str4, "");
    }

    public static void generateCombinations(String s1, String s2, String current) {
        if (current.length() == 2) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                generateCombinations(s1, s2, current + s1.charAt(i) + s2.charAt(j));
            }
        }
    }

    public static void generateCombinations(String s1, String s2, String s3, String current) {
        if (current.length() == 3) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                for (int k = 0; k < s3.length(); k++) {
                    generateCombinations(s1, s2, s3, current + s1.charAt(i) + s2.charAt(j) + s3.charAt(k));
                }
            }
        }
    }

    public static void generateCombinations(String s1, String s2, String s3, String s4, String current) {
        if (current.length() == 4) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                for (int k = 0; k < s3.length(); k++) {
                    for (int l = 0; l < s4.length(); l++) {
                        generateCombinations(s1, s2, s3, s4, current + s1.charAt(i) + s2.charAt(j) + s3.charAt(k) + s4.charAt(l));
                    }
                }
            }
        }
    }
}
