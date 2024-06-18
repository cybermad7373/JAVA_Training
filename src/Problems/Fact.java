package Problems;

public class Fact {
    public static void main(String[] args) {
        int numb = 5;
        System.out.println(fact(numb));
    }
    public static int fact(int num){
        if(num ==1)
            return 1;
        else
            return num * fact(num -1);
    }
}
