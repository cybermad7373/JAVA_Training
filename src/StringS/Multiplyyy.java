package StringS;
public class Multiplyyy {
    public static int divide(int dividend, int divisor) {
        // 0x80000000為最小的int型整數，即-2^31次方
        // 即當被除數是最小的整數（0x80000000），且除數是-1時，進行除法會導致溢位。在這種情況下，函數返回Integer.MAX_VALUE，即最大的整數。
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int negative = 0;
        if (dividend > 0) {
            negative++;
            dividend = -dividend;
        }

        if (divisor > 0) {
            negative++;
            divisor = -divisor;
        }
        int res = helper(dividend, divisor);
        return negative == 1 ? -res : res;
    }

    private static int helper(int dividend, int divisor) {
        int res = 0;
        while (dividend <= divisor) {
            int q = 1;// 一倍除數的商
            int doubleInt = divisor;// 一倍除數
            // 找出目前最大的除數倍數（2、4、8...)倍數
            // 避免溢位 (小於最小負整數) doubleInt 要避免小於 -2^31
            while (doubleInt >= Integer.MIN_VALUE >> 1 && dividend <= doubleInt + doubleInt) {
                q += q;
                doubleInt += doubleInt;
            }
            dividend -= doubleInt;
            res += q;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int num1 = 6561;
        int num2 = 54;
        System.out.println(divide(num1,num2));
        }
}