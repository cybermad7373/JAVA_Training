package Problems;

public class Matrix_01 {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{0,1,0},{1,1,1}};
        arr = updateMatrix(arr);
        for(int[] i : arr)
        {
            for(int j : i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        for(int i = 0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(mat[i][j]!=0)
                {
                    DFS(i,j,mat,row,col,0);
                }
            }
        }
        return mat;
    }
    public static int[][] DFS(int i,int j,int[][] mat,int row,int col,int count)
    {

        if(i<0||j<0||i>=row||j>=col || mat[i][j] == 0)
        {
            return mat;
        }
        count++;
        if(count >1)
            mat[i][j] = count;
        //  return mat;

        mat = DFS(i+1,j,mat,row,col,count);
        mat = DFS(i-1,j,mat,row,col,count);
        mat = DFS(i,j+1,mat,row,col,count);
        mat = DFS(i,j-1,mat,row,col,count);
        return mat;
    }
}
