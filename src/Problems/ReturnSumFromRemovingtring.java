package Problems;

import java.sql.SQLOutput;

public class ReturnSumFromRemovingtring {
    public static void main(String[] args) {
        String str = "cdbcbbaaabab";
        int x =4,y=5 ;
        System.out.println( maximumGain(str,x,y));
    }
    public static StringBuilder str = new StringBuilder("");
    public static int count =0;
        public static int maximumGain(String s, int x, int y) {
            str.append(s);
            if(x<y)
            {
                removeAB(str,x,y);
            }else{
                removeBA(str,y,x);
            }
            return count;
        }
        public static void removeAB(StringBuilder str,int x,int y)
        {
            int flag = 0;
            for(int i= 0;i<str.length()-1;i++)
            {
                if(str.charAt(i)=='a'&&str.charAt(i+1)=='b')
                {
                    flag =1;
                    str.deleteCharAt(i);
                    str.deleteCharAt(i);
                    count+=x;
                }
            }
            if(flag != 0)
                removeBA(str,x,y);


        }
        public static void removeBA(StringBuilder str,int x,int y)
        {
            int flag = 0;
            for(int i= 0;i<str.length()-1;i++)
            {
                if(str.charAt(i)=='b'&&str.charAt(i+1)=='a')
                {
                    flag =1;
                    str.deleteCharAt(i);
                    str.deleteCharAt(i);
                    count+=y;
                }
            }
            if(flag != 0)
                removeBA(str,x,y);

        }
}