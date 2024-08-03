
package Patterns;

public class Spiral {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5, 6, 7, 8},   //    ------->
                        {24,25,26,27,28,29,30, 9},   //   ^-----> |
                        {23,40,41,42,43,44,31,10},   //   | <---V |
                        {22,39,48,47,46,45,32,11},   //   ^-------V
                        {21,38,37,36,35,34,33,12},
                        {20,19,18,17,16,15,14,13}};

        int row_st = 0, row_end = arr.length-1;
        int col_st = 0, col_end = arr[0].length-1;
        while(row_st < row_end && col_st < col_end){

            for(int i = col_st;i<=col_end;i++)
                System.out.print(arr[row_st][i]+" ");

            row_st++;
            for(int i = row_st;i<=row_end;i++)
                System.out.print(arr[i][col_end]+" ");

            col_end--;
            for(int i = col_end;i>=col_st;i--)
                System.out.print(arr[row_end][i]+" ");

            row_end--;
            for(int i = row_end;i>=row_st;i--)
                System.out.print(arr[i][col_st]+" ");
            col_st++;

        }
    }
}
