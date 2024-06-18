package StringS;
class IndexedString {
    public static String sortSentence(String s) {
        StringBuilder str = new StringBuilder("");
        String[] arr = s.split(" ");
        for(int i = 1;i<=arr.length;i++)
        {
            for(String ele : arr)
            {
                int temp = ele.charAt(ele.length()-1);
                if(i==temp)
                {
                    for(int j =0;j<ele.length()-1;j++)
                    {
                        if(i==temp)
                        {
                            continue;
                        }
                        str.append(ele.charAt(j));
                    }
                }
                str.append(" ");

            }
        }
        return str.toString();
    }
    public static void main(String[] args)
    {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}