package Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,8,8,8,10};
        int target = 72;
//        function(arr,target,0);
        System.out.println(Arrays.toString(searchRange(arr,target)));


    }
    public static int[] searchRange(int[] nums, int target) {
        function(nums,target,0);
        // System.out.println(ans);
        if(ans.size()==1)
            ans.add(ans.get(0));

        if(ans.size()==0)
        {
            ans.add(-1);
            ans.add(-1);
        }
        int[] ansar = new int[2];
        ansar[0] = ans.get(0);
        ansar[1] = ans.get(ans.size()-1);
        return ansar;

    }
    static ArrayList<Integer> ans = new ArrayList<>();
    public static ArrayList<Integer> function(int[]arr ,int target,int pos){
        if(pos<arr.length) {
            if (target == arr[pos]) {
                ans.add(pos);
            }
            return function(arr,target,pos + 1);
        }
        //ans.add(-1);
        return ans;
    }
}
