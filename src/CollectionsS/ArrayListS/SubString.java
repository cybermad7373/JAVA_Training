package CollectionsS.ArrayListS;
import java.util.ArrayList;
public class SubString {
    static ArrayList<String> anss = new ArrayList<>();
    public static void printSub(String str,String ans){
        if(str.length() == 0){
            //System.out.println(ans);
            anss.add(ans);
            return;
        }
        char ch = str.charAt(0);
        printSub(str.substring(1),ans+ch);
        printSub(str.substring(1),ans);
    }
    public static void main(String[] args) {
        printSub("0123","");
        for(String i : anss )
        {
            System.out.println(i);
        }
    }
}
