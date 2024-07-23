package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation2 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        List<List<Integer>> ans = new ArrayList<>();
        ans = fun(ans,new ArrayList<>(),num);
        for(List<Integer> i : ans){
            System.out.println(i);
        }


    }
    public static List<List<Integer>> fun (List<List<Integer>> ans , List <Integer> temp, int[] arr){
        if(temp.size() == arr.length){
            ans.add(temp);
            return ans;
        }
        for(int i : arr){
            if(temp.contains(i))
                continue;
            temp.add(i);
            fun(ans, temp, arr);
            temp.remove(temp.size()-1);
        }
        return ans;
    }
}
