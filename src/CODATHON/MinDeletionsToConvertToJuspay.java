package CODATHON;

public class MinDeletionsToConvertToJuspay {

    public static int minDeletions(String s) {
        String target = "Juspay";
        int n = s.length();
        int m = target.length();

        int[][] dp = new int[n + 1][m + 1];

        // Initialize first row and first column of dp array
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i; // Delete all characters in s to match an empty string
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j; // Delete all characters in an empty string to match target[0...j-1]
        }

        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == target.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String s = "Jusdpayy";
        int deletions = minDeletions(s);
        System.out.println("Minimum deletions required: " + deletions); // Output: Minimum deletions required: 2
    }
}




//           "" J u s p a y
//        "" 0  1 2 3 4 5 6
//        J  1  0 1 2 3 4 5
//        u  2  1 0 1 2 3 4
//        s  3  2 1 0 1 2 3
//        d  4  3 2 1 1 2 3
//        p  5  4 3 2 1 1 2
//        a  6  5 4 3 2 2 1
//        y  7  6 5 4 3 3 2
