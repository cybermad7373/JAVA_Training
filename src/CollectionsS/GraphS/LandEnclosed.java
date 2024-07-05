package CollectionsS.GraphS;

public class LandEnclosed {
    public static void main(String[] args) {
        int[][] arr ={{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};

        System.out.println(travelfromedge(arr));
    }
    public static int row =0;
    public static int col=0;
    public static int travelfromedge(int[][] landwater)
    {
        row = landwater.length;
        col = landwater[0].length;
        int escapeland=0;
        int tot=0;
        for(int i =0;i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                if(i ==0 || j ==0||i==row-1||j==col-1)
                {
                    if(landwater[i][j] == 1)
                    {
                     escapeland+=(travel(i,j,landwater,0));
                    }
                }
                if(landwater[i][j] == 1 ||landwater[i][j] == 2)
                {
                    tot++;
                }
            }

        }
        System.out.println(escapeland);
        return tot - escapeland;
    }
    public static int travel(int i,int j,int[][] landwater,int count)
    {
        if(i<0||i>=row||j<0||j>=col||landwater[i][j]!=0){
            return count;
        }
        count++;
        landwater[i][j] =2;
        travel(i+1,j,landwater,count);
        travel(i-1,j,landwater,count);
        travel(i,j+1,landwater,count);
        travel(i,j-1,landwater,count);
        return count;
    }
}
