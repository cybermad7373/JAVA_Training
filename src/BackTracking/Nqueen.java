package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Nqueen {
    static int qpsf=0;
    public static void main(String[] args) {
        int n = 6;
        ArrayList<ArrayList<Character>> ans = new ArrayList<ArrayList<Character>>();
        queens(new boolean[n][n],ans,n,0,0,qpsf,0);
    }

    public static void queens(boolean[][] bool, ArrayList<ArrayList<Character>> ans ,
                              int size,int row,int col,int qpsf,int inx)
    {
        if( qpsf == size || row==size ||col==size)
            return ;

        if(bool[row][col]==false)
        {
            bool[row][col] = true;
           // ans.set(inx, {row, col});
            System.out.println(row + " " + col+ ":\n ");
            for(int i =0;i<bool.length;i++){
                for(int j =0;j<bool[0].length;j++)
                {
                    if(bool[i][j]==true)
                        continue;

                    bool[row][j] = true;
                    bool[i][col] = true;
                    if(i+j == row+col || j -i == col-row )
                    {
                        bool[i][j] =true;
                    }
                }
            }
            for(boolean[] i : bool)
            {
                for(boolean j : i)
                {
                    if(j)
                        System.out.print("Q ");
                    else
                        System.out.print(". ");
                }
                System.out.println();
            }
            System.out.println("\n");
            queens(bool, ans, size, row+1, col, qpsf+1,inx);
            queens(bool, ans, size, row, col+1, qpsf+1,inx);
            if(qpsf == size) {
                return;
            }
            else{
                queens(new boolean[size][size],ans,size,0,col+1,0,inx+1);
            }

        }
    }
}
