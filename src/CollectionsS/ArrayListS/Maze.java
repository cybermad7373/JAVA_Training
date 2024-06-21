package CollectionsS.ArrayListS;

//  +--------------+         possible ways => H:Horizontal || V:Vertical
//  | s  |    |    |         H H V V
//  +----+----+----+         H V H V
//  |    |    |    |         H V V H
//  +----+----+----+         V V H H
//  |    |    |  E |         V H V H
//  +--------------+         V H H V

import java.util.ArrayList;
import java.util.Iterator;

public class Maze{
    static ArrayList<String> alist = new ArrayList<>();
    public static void Path(int n,int row,int col,String ans) {
        if(row == n && col == n)
        {
            //System.out.println(ans);
            alist.add(ans);
            return;
        }
        if(row> n|| col >n)
        {
            return;
        }
        Path(n,row,col+1,ans+"H");
        Path(n,row+1,col,ans+"V");
        Path(n,row+1,col+1,ans+"D");

    }
    public static void main(String[] args) {
        Path(2,0,0,"");

//        for(String i : alist)
//        {
//            System.out.println(i);
//        }


        Iterator itr=alist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
