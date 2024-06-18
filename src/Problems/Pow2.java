package Problems;

public class Pow2 {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(poww(num));
    }
    public static int poww(int p)
    {
        if(p==1)
            return 2;
        else
            return 2* poww(p-1);
    }
}
