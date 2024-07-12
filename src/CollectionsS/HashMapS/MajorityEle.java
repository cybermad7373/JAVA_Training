package CollectionsS.HashMapS;

import java.util.HashMap;

public class MajorityEle {
    public static void main(String[] args) {
        int[] arr = {6,1,2,3,4,5,1,2,4,1,8,2,1,3};
        System.out.println(function(arr));;
    }

    public static int function(int[] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++)
        {
            int ch = arr[i];
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }

        System.out.println(map);
        return 1;
    }
}
