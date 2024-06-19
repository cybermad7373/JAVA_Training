package Recursion;

//  +--------------+         possible ways => H:Horizontal || V:Vertical
//  | s  |    |    |         H H V V
//  +----+----+----+         H V H V
//  |    |    |    |         H V V H
//  +----+----+----+         V V H H
//  |    |    |  E |         V H V H
//  +--------------+         V H H V

public class MazePath {

    public static void Path(int n,int row,int col,String ans) {
        if(row == n && col == n)
        {
            System.out.println(ans);
            return;
        }
        if(row> n|| col >n)
        {
            return;
        }
        Path(n,row,col+1,ans+"H");
        Path(n,row+1,col,ans+"V");

    }
    public static void main(String[] args) {
        Path(2,0,0,"");
    }
}
