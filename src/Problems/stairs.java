package Problems;

public class stairs {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(steps(n+1));
    }
    public static int steps(int n)
    {
        if(n <=1)
            return n;
        return steps(n-1) + steps(n-2);
    }
}
