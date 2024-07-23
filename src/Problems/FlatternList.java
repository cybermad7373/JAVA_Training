package Problems;

import java.util.Arrays;

public class FlatternList {
    public static void main(String[] args) {
        String question = "[[1],[2,3],4,[5,6]]]";
        StringBuilder bew = new StringBuilder(" ");
        for(int i =0;i<question.length();i++) {
            char temp = question.charAt(i);
            if(temp == '1' || temp == '2' || temp == '3' || temp == '4' ||
                    temp == '5' || temp == '6' || temp == '7' || temp == '8' || temp == '9' ||temp == '0' ){
                bew.append(temp);
            }
        }
//        System.out.println(bew);
        int[] arr = new int[bew.length()];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = Integer.parseInt(String.valueOf(bew.charAt(i)));
        }
        System.out.println(Arrays.toString(arr));
    }
}
