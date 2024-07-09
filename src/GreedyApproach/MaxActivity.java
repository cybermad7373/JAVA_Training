package GreedyApproach;

import java.util.ArrayList;

// IP   1 3 0 5 8 5
//      2 4 6 7 9 9   (MAX work than can be done)
//  OP   : 0 1 3 4 (4 works)
public class MaxActivity {

    public static int coutn_activity(int[] start,int[] end)
    {
        int last = end[0];
        int count =0;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(start[0]);
        for(int i = 0;i<start.length;i++)
        {
            if(start[i]>last)
            {
                arr.add(start[i]);
                last = end[i];
                count++;

            }
        }
        for(Integer i : arr)
        {
            System.out.print(" -> "+i);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        System.out.println("\n"+coutn_activity(start,end));

    }
}
