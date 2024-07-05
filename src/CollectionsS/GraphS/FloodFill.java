package CollectionsS.GraphS;

public class FloodFill {
    public static void main(String[] args) {
        int[][] map = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1,sc=1,clr =2;

        map = floodpaint(map,clr,sr,sc);

        for(int[] i : map)
        {
            for(int j :i)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

    }
    public static int[][] floodpaint(int[][] map,int clr,int sr,int sc)
    {
        int row = map.length;
        int col = map[0].length;
        map = change_clr(sr,sc,map,row,col);
        return map;

    }

    public static int[][] change_clr(int i,int j,int[][] map,int row,int col)
    {
        if(i<0 || i>=row ||j<0||j>=col||map[i][j]!=1 )
            return map;

        map[i][j] = 2;
        map = change_clr(i+1,j,map,row,col);
        map = change_clr(i-1,j,map,row,col);
        map = change_clr(i,j+1,map,row,col);
        map = change_clr(i,j-1,map,row,col);
        return map;
    }
}
