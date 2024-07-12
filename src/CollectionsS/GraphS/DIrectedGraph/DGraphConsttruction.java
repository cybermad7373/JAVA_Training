package CollectionsS.GraphS.DIrectedGraph;

import java.util.Scanner;
import java.util.Vector;

public class DGraphConsttruction {
    public static void Gadd(int vertex,int[] edges)
    {
        Vector<Integer>[] adj = new Vector[vertex];
        for(int i =0;i< adj.length;i++)
        {
            adj[i] = new Vector<>();
        }
        for(int i = 0;i<vertex;i++)
        {
            addedge(adj,i,edges[i]);
        }
        display(adj);
        find_circle(adj,0);
    }
    public static void addedge(Vector<Integer>[] adj,int pos, int val)
    {
       // System.out.println(pos+" "+val);
        adj[pos].add(val);
    }
    public static void display(Vector<Integer>[] vec){
        for(int i=0;i< vec.length;i++)
        {
            System.out.print(i+" -> ");
            for(int j : vec[i])
            {
                System.out.println(j);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int vertex = sc.nextInt();
        int vertex = 23;
//        String str  = sc.nextLine();
//        String[] strl = str.split(" ");
//        int[] edges = new int[strl.length];
//        for(int i =0;i<edges.length;i++)
//        {
//            edges[i] = Integer.parseInt(strl[i]);
//        }
        int[] edges = {4 ,4, 1, 4, 13, 8, 8, 8, 0, 8, 14, 9, 15, 11, -1, 10, 15, 22, 22, 22, 22, 22, 21};
        Gadd(vertex,edges);
    }
public static int max =0;
public static void find_circle(Vector<Integer>[] adj,int pos){
        if(adj[pos]!=null)
        {
            adj[pos]    
        }
    }
}
