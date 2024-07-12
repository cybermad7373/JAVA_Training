package CODATHON;

import java.util.*;

public class ShortestTimePath {

    static class Edge {
        int to;
        int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public static int findMinimumTimePath(int src, int dest, Map<Integer, List<Edge>> graph) {
        // Initialize distances array
        int[] dist = new int[graph.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Priority queue for Dijkstra's algorithm (min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(node -> dist[node]));
        pq.offer(src);

        while (!pq.isEmpty()) {
            int current = pq.poll();

            // Check all neighbors of current node
            if (graph.containsKey(current)) {
                for (Edge edge : graph.get(current)) {
                    int neighbor = edge.to;
                    int newDist = dist[current] + edge.weight;

                    // Update distance if a shorter path is found
                    if (newDist < dist[neighbor]) {
                        dist[neighbor] = newDist;
                        pq.offer(neighbor);
                    }
                }
            }
        }

        // Return minimum time to reach dest
        return dist[dest];
    }

    public static void main(String[] args) {
        // Example graph represented as adjacency list
        Map<Integer, List<Edge>> graph = new HashMap<>();

        // Adding edges to the graph
        graph.put(0, Arrays.asList(new Edge(1, 4), new Edge(2, 1)));
        graph.put(1, Arrays.asList(new Edge(2, 2), new Edge(3, 5)));
        graph.put(2, Arrays.asList(new Edge(3, 1)));
        graph.put(3, Arrays.asList()); // Node 3 has no outgoing edges

        int src = 0;
        int dest = 3;

        int minTime = findMinimumTimePath(src, dest, graph);

        if (minTime == Integer.MAX_VALUE) {
            System.out.println("No path exists from node " + src + " to node " + dest);
        } else {
            System.out.println("Minimum time to reach from node " + src + " to node " + dest + " is: " + minTime);
        }
    }
}
