package Practice;

import java.util.Arrays;

public class Island {
    public static void main(String[] args) {
        char[][] ar = {   {'1','1','0','0','0'},
                          {'1','1','0','0','0'},
                          {'0','0','1','0','0'},
                          {'0','0','0','1','1'}  };
        System.out.println(count(ar));

    }
    public static int count(char[][] island){
        int row = island.length;
        int col = island[0].length;
        int count  = 0;

        for(int i = 0;i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                if(island[i][j] == '1')
                {
                    dfs(i,j,island,row,col);
                    count++;
                }
            }

        }

        return count;
    }
    public static void dfs(int i,int j,char[][] island,int r,int c){
        if(i<0 || i >=r || j <0 || j >= c || island[i][j] == '2' || island[i][j] == '0')
            return ;
        if(island[i][j] == '1')
//            System.out.println(i+","+j);
            island[i][j] = '2';

        dfs(i+1, j, island, r, c);
        dfs(i-1, j, island, r, c);
        dfs(i, j+1, island, r, c);
        dfs(i, j-1, island, r, c);


    }
}
