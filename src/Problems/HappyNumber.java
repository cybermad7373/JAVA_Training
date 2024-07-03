package Problems;

import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args) {
        HappyNumber hs = new HappyNumber();
        int num = 19;
        System.out.println(function(num));
        System.out.println(hashset(num));
    }



    public static boolean hashset(int num)
    {
        HashSet<Integer> hs = new HashSet<>();

        while (true) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num = num / 10;
            }

            if (sum == 1) {
                return true;
            } else if (hs.contains(sum)) {
                return false;
            } else {
                hs.add(sum);
                num = sum;
            }
        }
    }
    public static boolean function(int num) {
        while (true) {
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num = num / 10;
            }

            if (sum == 1) {
                return true;
            }


            if (sum == 4) {
                return false;
            }

            num = sum;
        }
    }
}
