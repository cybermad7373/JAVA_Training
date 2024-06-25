package Recursion;

public class ValidPranthesis {

    public static void Pranthesis(int o,int c,String ans,int num) {

//        if (ans.length() == num*2) {
//            if (o == c) {
//                System.out.println(ans);
//            }
//            return;
//        }
//
//        Pranthesis(o + 1, c, ans + '(', num);
//        if (c < o) {
//            Pranthesis(o, c + 1, ans + ')', num);
//        }


        ///////////////////////////////////////////

//        if(o == num && c == num){
//            System.out.println(ans);
//            return;
//        }
//        if(o>num||c>num){
//            return;
//        }
//        Pranthesis(o+1,c, ans+'(',num);
//        if(c<o) {
//            Pranthesis(o,c+1,ans+')',num);
//        }

        if(ans.length() == num*2)
        {
            System.out.println(ans);
            return;
        }
        if(o<num)
        {
            Pranthesis(o+1,c,ans+'(',num);
        }
        if(c<o)
        {
            Pranthesis(o,c+1,ans+')',num);
        }

    }
    public static void main(String[] args) {
        Pranthesis(0,0,"",3);
    }
}
