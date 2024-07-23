package CollectionsS.GraphS.DIrectedGraph;

import java.util.*;

class Neww
{

    // Function to add edges
    static void addEdge(Vector<Integer>[] adj, int u, int v)
    {
        adj[u].add(v);
    }

    // Function to print adjacency list
    static void adjacencylist(Vector<Integer>[] adj, int V)
    {
        for (int i = 0; i < V; i++) {
            System.out.print(i+ "->");
            for (int x : adj[i]) {
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }


    static void initGraph(int V, int[][] edges, int noOfEdges)
    {

        @SuppressWarnings("unchecked")
        Vector<Integer>[] adj = new Vector[3];
        for(int i =0;i<adj.length;i++) {
            adj[i] = new Vector<>();
        }

        for (int i = 0; i < noOfEdges; i++) {


            addEdge(adj, edges[i][0], edges[i][1]);
        }


        adjacencylist(adj, V);
    }


    public static void main(String[] args)
    {
        int V = 3;

        int[][] edges = { { 0, 1 }, { 1, 2 }, { 2, 0 } };

        int noOfEdges = 3;

        initGraph(V, edges, noOfEdges);

    }
}
