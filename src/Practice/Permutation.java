package Practice;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String str = "123";
        String[] strr = str.split("");
        int n = 2;
        List<List<String>> ans = new ArrayList<>();
        rec(ans, new ArrayList<>(), strr, n);
        for (List<String> perm : ans) {
            System.out.println(perm);
        }
    }

    public static void rec(List<List<String>> ans, List<String> temp, String[] str, int n) {
        if (temp.size() == n) {
            ans.add(new ArrayList<>(temp)); // Make a copy of temp and add it to ans
            return;
        }
        for (String ch : str) {
            if (temp.contains(ch))
                continue;
            temp.add(ch);
            rec(ans, temp, str, n);
            temp.remove(temp.size() - 1);
        }
    }
}
