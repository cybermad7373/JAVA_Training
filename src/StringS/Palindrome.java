package StringS;
import java.util.*;

public class Palindrome {

    public static boolean Palindrom(String str)
    {
        String rev = "";
        boolean ans = false;
        for(int i = str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
        {
            ans = true;
        }
        return ans;
    }

    public static int PalindromTwo(String str) {
        int flag = 0,i=0,j=str.length()-1;

        while(i<j){
            if(str.charAt(i)!=(str.charAt(j)))
            {
                flag = 0;
                break;
            }
            else{
                flag = 1;
            }
            i++;j--;
        }
        return flag;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int flag = PalindromTwo(str);
        if(flag == 1)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
    
}