package Practice;

import java.util.Arrays;
import java.util.HashMap;

public class SortJumbledNumbers {
    public static void main(String[] args) {
        int[] mapping = {8,9,4,0,2,1,3,5,7,6};
        int[] nums = {338, 38, 991};
        int[] vals = fun(mapping, nums);
        int[] ans = find_position(vals, nums);

        // Print the sorted result
        System.out.println(Arrays.toString(ans));
    }

    public static int[] find_position(int[] vals, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(vals[i], nums[i]);
        }

        // Sort the vals array
        Arrays.sort(vals);

        // Map back to original numbers
        int[] sortedNums = new int[vals.length];
        for (int i = 0; i < vals.length; i++) {
            sortedNums[i] = map.get(vals[i]);
        }

        return sortedNums;
    }

    public static int[] fun(int[] maps, int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0;
        for (int vals : nums) {
            int mappedValue = 0;
            int place = 1;

            while (vals > 0) {
                mappedValue += maps[vals % 10] * place;
                vals /= 10;
                place *= 10;
            }

            ans[pos] = mappedValue;
            pos++;
        }

        return ans;
    }


}
