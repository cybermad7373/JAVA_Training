package CollectionsS.GraphS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs3 {
    public static void main(String[] args) {
        int v = 8;
        ArrayList<ArrayList<Integer>> nodes = new ArrayList<>();
        for(int i=0;i<v;i++){
            nodes.add( new ArrayList<>());
        }

        nodes.get(1).add(2);
        nodes.get(2).add(1);
        nodes.get(1).add(3);
        nodes.get(3).add(1);
        nodes.get(3).add(7);
        nodes.get(7).add(3);
        nodes.get(3).add(4);
        nodes.get(4).add(3);
        nodes.get(7).add(8);
        nodes.get(8).add(7);
        nodes.get(4).add(8);
        nodes.get(8).add(4);

        ArrayList<Integer> ans = bfs(nodes,v);
        System.out.println(ans);

    }

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj,int v)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<v;i++){
            if(!visited[i]){
                q.add(i);
                visited[i] = true;

                while(!q.isEmpty()){
                    int node = q.poll();
                    ans.add(node);
                    for (Integer j : adj.get(node)){
                        if(!visited[j]){
                            visited[j]= true;
                            q.add(j);
                        }
                    }
                }
            }
        }
        return ans;

    }
}