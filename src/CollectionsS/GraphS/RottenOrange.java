package CollectionsS.GraphS;

import java.util.ArrayList;

public class RottenOrange {
    public static void main(String[] args) {

        int[][] vals = {{2,1,1},{1,1,0},{0,1,1}};

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<vals.length;i++)
        {
            for(int j =0;j< vals[i].length;j++){
                adj.add(new ArrayList<>());
            }

        }

        for(int i =0;i<vals.length;i++)
        {
            for(int j =0;j< vals[i].length;j++)
            {
                adj.get(i).add(j);
            }
        }

    }
}
