package CODATHON;

import java.util.*;

public class LargestSumCycle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int[] Edge = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            Edge[i] = scanner.nextInt();
//        }
        int N = 23;
        int[] Edge = {4, 4, 1, 4, 13, 8, 8, 8, 0, 8, 14, 9, 15, 11, -1, 10, 15, 22, 22, 22, 22, 22, 21};

        int result = findLargestCycle(N, Edge);
        System.out.println(result);

        scanner.close();
    }

    public static int findLargestCycle(int N, int[] Edge) {
        int maxCycleSum = 0;

        for (int i = 0; i < N; i++) {
            boolean[] visited = new boolean[N];
            List<Integer> path = new ArrayList<>();
            int cycleSum = dfs(i, Edge, visited, path);

            if (cycleSum > 0) {
                maxCycleSum = Math.max(maxCycleSum, cycleSum);
            }
        }

        return maxCycleSum;
    }

    public static int dfs(int start, int[] Edge, boolean[] visited, List<Integer> path) {
        if (visited[start]) {
            int startIndex = path.indexOf(start);
            if (startIndex != -1) {
                // Cycle detected
                List<Integer> cycleNodes = path.subList(startIndex, path.size());
                int cycleSum = calculateCycleSum(cycleNodes);
                return cycleSum;
            }
            return 0;
        }

        visited[start] = true;
        path.add(start);

        int nextNode = Edge[start];
        if (nextNode != -1) {
            int cycleSum = dfs(nextNode, Edge, visited, path);
            if (cycleSum > 0) {
                return cycleSum;
            }
        }

        path.remove(path.size() - 1);
        return 0;
    }

    public static int calculateCycleSum(List<Integer> cycleNodes) {
        int sum = 0,count =0;
        for (int node : cycleNodes) {
//            sum += node;
            count++;
        }
//        System.out.println(count);
//        return sum;
        return count;
    }
}

