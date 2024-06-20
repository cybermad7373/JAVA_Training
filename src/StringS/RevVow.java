package StringS;
import java.util.Scanner;
public class RevVow {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            StringBuilder vow = new StringBuilder("");


            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vow.append(ch);
                }
            }


            StringBuilder reversed = new StringBuilder(str);
            vow.reverse();


            int j = 0;

            for (int i = 0; i < reversed.length(); i++) {
                char ch = reversed.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.print(vow.charAt(j));
                    j++;
                } else
                {
                    System.out.print(ch);
                }
            }
        }
}

