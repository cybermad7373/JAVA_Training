package CODATHON;

import java.util.Vector;

public class LargestPointingNumber {
    public static void main(String[] args) {
        int N = 23;
        int[] Edge = {4, 4, 1, 4, 13, 8, 8, 8, 0, 8, 14, 9, 15, 11, -1, 10, 15, 22, 22, 22, 22, 22, 21};
        int maxWeightNode = findMaxWeightNode(N, Edge);
        System.out.println(maxWeightNode);
    }

    public static int findMaxWeightNode(int N, int[] edges) {
        // Step 1: Initialize data structures
        Vector<Integer>[] adj = new Vector[N];
        int[] weight = new int[N];

        for (int i = 0; i < N; i++) {
            adj[i] = new Vector<>();
        }

        // Step 2: Create adjacency list and calculate node weights
        for (int i = 0; i < N; i++) {
            if (edges[i] != -1) {
                adj[edges[i]].add(i); // i points to edges[i]
                weight[edges[i]] += i; // Increase weight of edges[i] by i
            }
        }

        // Step 3: Find the node with maximum weight
        int maxWeight = -1;
        int maxWeightNode = -1;
        for (int i = 0; i < N; i++) {
            if (weight[i] > maxWeight) {
                maxWeight = weight[i];
                maxWeightNode = i;
            }
        }

        return maxWeightNode;
    }
}
