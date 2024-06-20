package Problems;

public class DefectKeyboard {


    public static void defect(String str)
    {
        StringBuilder rev = new StringBuilder("");
        int pos = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'i')
            {
                pos = i;
                break;
            }
            rev.append(str.charAt(i));
        }
        rev.reverse();
        System.out.print(rev);
        for (int i = pos+1; i < str.length(); i++)
        {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "string";
        defect(str);
    }
}