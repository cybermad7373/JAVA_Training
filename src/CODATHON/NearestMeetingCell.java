package CODATHON;

import java.util.*;

public class NearestMeetingCell {

    public static int findNearestMeetingCell(int N, int[] edges, int C1, int C2) {
        if (C1 == C2) {
            return C1;
        }

        // Create adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int neighbor = edges[i];
            if (neighbor != -1) {
                if (!graph.containsKey(i)) {
                    graph.put(i, new ArrayList<>());
                }
                graph.get(i).add(neighbor);
            }
        }

        // BFS initialization
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        Set<Integer> visited1 = new HashSet<>();
        Set<Integer> visited2 = new HashSet<>();

        queue1.offer(C1);
        visited1.add(C1);
        queue2.offer(C2);
        visited2.add(C2);

        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            // BFS from C1
            if (!queue1.isEmpty()) {
                int current1 = queue1.poll();
                if (visited2.contains(current1)) {
                    return current1;
                }
                if (graph.containsKey(current1)) {
                    for (int neighbor : graph.get(current1)) {
                        if (!visited1.contains(neighbor)) {
                            queue1.offer(neighbor);
                            visited1.add(neighbor);
                        }
                    }
                }
            }

            // BFS from C2
            if (!queue2.isEmpty()) {
                int current2 = queue2.poll();
                if (visited1.contains(current2)) {
                    return current2;
                }
                if (graph.containsKey(current2)) {
                    for (int neighbor : graph.get(current2)) {
                        if (!visited2.contains(neighbor)) {
                            queue2.offer(neighbor);
                            visited2.add(neighbor);
                        }
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int N = 23;
        int[] edges = {4, 4, 1, 4, 13, 8, 8, 8, 0, 8, 14, 9, 15, 11, -1, 10, 15, 22, 22, 22, 22, 22, 21};
        int C1 = 9;
        int C2 = 2;

        int result = findNearestMeetingCell(N, edges, C1, C2);
        System.out.println(result); // Output: 4
    }
}
