package Recursion;

import java.util.Arrays;

public class RemoveDuplicate {
    static int[] a = new int[26];

    public static void rmduplicate(String str) {
        if (str.length() == 0) {
            display(a, a.length - 1);
            return;
        }

        char temp = str.charAt(0);
        int pos = temp - 'a';
        a[pos] += 1;

        rmduplicate(str.substring(1));
    }

    public static void display(int[] arr, int val) {
        if (val != -1) {
            display(arr, val - 1);
            if (arr[val] == 1) {
                char b = (char) (val + 'a');
                System.out.print(b + " ");
            }
        }
    }

    public static void main(String[] args) {
        rmduplicate("abcdebscaf");
    }
}
