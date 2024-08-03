package CollectionsS.GraphS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS2 {
    public static void main(String[] args) {
        int vertex = 5;
        ArrayList<ArrayList<Integer>> nodes = new ArrayList<>();
         for(int i = 0;i<vertex;i++){
             nodes.add(new ArrayList<>());
        }
        nodes.get(0).add(1);
        nodes.get(1).add(0);
        nodes.get(0).add(4);
        nodes.get(4).add(0);
        nodes.get(1).add(2);
        nodes.get(2).add(1);
        nodes.get(1).add(3);
        nodes.get(3).add(1);
        System.out.println(bfsGraph(nodes,vertex));
    }

    public static ArrayList<Integer> bfsGraph(ArrayList<ArrayList<Integer>> adj,int vertex){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[vertex];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(Integer i : adj.get(node)){
                if(!vis[i]){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
        return bfs;
    }
}
