package CollectionsS.GraphS;

public class LandEnclosed {
    public static void main(String[] args) {
        int[][] arr ={{0,1,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};

        System.out.println(travelfromedge(arr));
    }

    public static int travelfromedge(int[][] landwater)
    {
        int row = landwater.length;
        int col = landwater[0].length;
        int escapeland=0;
        int tot=0;
        for(int i =0;i<row;i++)
        {
            for(int j =0;j<col;j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {

                    if (landwater[i][j] == 1) {
                        escapeland += (travel(i, j, landwater, 0,row,col));
                    }
                }

                if (landwater[i][j] == 1 || landwater[i][j] == 2) {
                    tot++;
                }
            }

        }
        return tot - escapeland;
    }
    public static int travel(int i,int j,int[][] landwater,int count,int row,int col)
    {
        if(i<0||i>=row||j<0||j>=col||landwater[i][j]!=1){
            return count;
        }
       // System.out.println("fsdf");
        count++;
        landwater[i][j] =2;
        count = travel(i+1,j,landwater,count,row,col);
        count = travel(i-1,j,landwater,count,row,col);
        count = travel(i,j+1,landwater,count,row,col);
        count = travel(i,j-1,landwater,count,row,col);
        return count;
    }
}
