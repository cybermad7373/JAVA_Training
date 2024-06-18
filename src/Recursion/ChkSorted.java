public class ChkSorted {
    static int flag = 1;

    public static void Chkk(int[] nums, int val) {
        if (val > 0) {
            Chkk(nums, val - 1);
            if (nums[val] < nums[val - 1]) {
                flag = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Chkk(intArray, intArray.length - 1);

        if (flag == 1) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
