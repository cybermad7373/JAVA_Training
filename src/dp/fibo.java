package dp;

import java.util.Arrays;

public class fibo {
    public static void main(String[] args) {
        int n = 5;
        int[] mem = new int[n+1];
        Arrays.fill(mem,-1);
        System.out.println(fib(n,mem));
    }
    public static int fib(int n,int[] mem){
        if(n<=1) return n;
        if(mem[n] != -1) return mem[n];
        return mem[n] = fib(n-1,mem) + fib(n-2,mem);
    }
}
// 0 1 1 2 3 5