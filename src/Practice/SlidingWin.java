package Practice;
// highest sum of k elements
public class SlidingWin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};  // Expected output: 15
        int k = 3;
        System.out.println(sum(arr, k));
    }

    static int sum(int[] nums, int k) {
        int msum = 0;
        for (int i = 0; i < k; i++) {
            msum += nums[i];
        }

        int wsum = msum;
        for (int i = k; i < nums.length; i++) {
            wsum = wsum - nums[i - k] + nums[i];
            msum = Math.max(wsum, msum);
        }

        return msum;
    }
}
