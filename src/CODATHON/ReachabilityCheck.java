package CODATHON;

import java.util.*;

public class ReachabilityCheck {

    // Method to check if dest is reachable from src using BFS
    public static boolean isReachable(int src, int dest, Map<Integer, List<Integer>> graph) {
        if (src == dest) {
            return true; // A node is always reachable from itself
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(src);
        visited.add(src);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // Check all neighbors of current node
            if (graph.containsKey(current)) {
                for (int neighbor : graph.get(current)) {
                    if (!visited.contains(neighbor)) {
                        if (neighbor == dest) {
                            return true; // Found dest
                        }
                        queue.offer(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }

        return false; // dest not reachable from src
    }

    public static void main(String[] args) {
        // Example graph represented as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // Adding edges to the graph
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(0, 3));
        graph.put(3, Arrays.asList(3));

        int src = 1;
        int dest = 3;

        boolean reachable = isReachable(src, dest, graph);

        if (reachable) {
            System.out.println("Node " + dest + " is reachable from node " + src);
        } else {
            System.out.println("Node " + dest + " is not reachable from node " + src);
        }
    }
}
