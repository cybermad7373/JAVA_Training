//package Recursion;
//import java.util.Arrays;
//public class PrintOnce {
//    static int[] a = new int[26];
//
//    public static void rmduplicate(String str ) {
//
//        if(str.length()==0){
//            return;
//        }
//
//        char temp  = str.charAt(0);
//        int pos = temp-97;
//        a[pos] += 1;
//        for(int i = 0;i<25;i++)
//        {
//            if(a[i]==1)
//            {
//                char t = i+97;
//                System.out.println(t);
//            }
//
//        }
//
//        rmduplicate(str.substring(1));
//    }
//
//    public static void main(String[] args) {
//        Arrays.fill(a,0);
//        rmduplicate("abcdebscaf");
//        //System.out.println(Arrays.toString(a));
//    }
//}
