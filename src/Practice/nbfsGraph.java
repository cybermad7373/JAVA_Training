package Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class nbfsGraph {
    public static void main(String[] args) {
        int vertex = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<vertex;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        ArrayList<Integer> ans = bfs(adj,vertex);
        System.out.println(ans);
    }

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj,int vertex){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean visited[] = new boolean[vertex];
        Queue<Integer> q = new LinkedList<>();

        visited[0] = true;
        q.add(0);
        while (!q.isEmpty()){
            Integer data = q.poll();
            ans.add(data);
            for(Integer i : adj.get(data)){
                if(visited[i] == false){
                    visited[i] = true;
                    q.add(i);
                }
            }

        }
        return  ans;
    }
//    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj,int v,ArrayList<Integer> ans){
//        if(ans.size() == v)
//            return ans;
//
//    }

}
