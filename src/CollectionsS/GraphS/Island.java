package CollectionsS.GraphS;

public class Island {
    public static void main(String[] args) {
        char[][] ar = { {'1','1','0','0','0'},
                        {'1','1','0','0','0'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}  };
        System.out.println(noofisland(ar));
    }
    public static int row = 0;
    public static int col = 0;

    public static int noofisland(char[][] landwater){
        int count =0;
        row = landwater.length;
        col = landwater[0].length;

        for(int i = 0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(landwater[i][j]=='1'){
                    travelingland(i,j,landwater);
                    count++;
                }

            }
        }
        return count;
    }

    public static void travelingland(int i,int j,char[][] landwater){
        if(i<0||i>=row||j<0||j>=col||landwater[i][j]!='1'){
            return;
        }


        landwater[i][j] = 'V';
        travelingland(i+1,j,landwater);
        travelingland(i-1,j,landwater);
        travelingland(i,j+1,landwater);
        travelingland(i,j-1,landwater);
    }
}
