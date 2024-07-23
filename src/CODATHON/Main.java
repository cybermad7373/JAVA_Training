package CODATHON;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String str =sc.nextLine();
//        String[] strr = str.split(" ");
//        int[] arr = new int[strr.length];
        int[] arr = {121,123,1313,1221,697,6699};
        int sumStable=0;
        int sumUnstable=0;
        for(int i=0;i<arr.length;i++)
        {
//            arr[i] = Integer.parseInt(strr[i]);
            if(isStable(arr[i])){
                sumStable+=arr[i];
            }else{
                sumUnstable+=arr[i];
            }
        }
        int password = sumStable - sumUnstable;
        System.out.println(password);
    }
    private static boolean isStable(int num) {
        String numStr = String.valueOf(num);
        int[] digitCount = new int[10];
        for (char ch : numStr.toCharArray()) {
            int digit = ch - '0';
            digitCount[digit]++;
        }
        int firstNonZero = 0;
        for (int count : digitCount) {
            if (count > 0) {
                if (firstNonZero == 0) {
                    firstNonZero = count;
                } else if (count != firstNonZero) {
                    return false;
                }
            }
        }
        return true; 
    }
}


