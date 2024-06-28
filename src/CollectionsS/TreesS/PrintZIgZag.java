package CollectionsS.TreesS;

import java.util.*;

public class PrintZIgZag {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        /*
         *                         1     (start)---+
         *                     /      \            |
         *                   /         \           |
         *     +---------   2           3   <<-----+
         *     |          /   \      /    \
         *     +---->>  4    5     6        7  ---------+
         *             /\    /\   /\       / \          |
         * (end)<<--- 8  9 10 11 12 13    14 15  <<-----+
         *
         * OP : 1 3 2 4 6 7 15 14 13 12 11 10 9 8
         *
         * */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);

        List<List<Integer>>  result = ZigZag(root);
        Print(result);

    }

    public static List<List<Integer>> ZigZag(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                if (leftToRight) {
                    currentLevel.add(node.data);
                } else {
                    currentLevel.add(0, node.data);
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(currentLevel);
            leftToRight = !leftToRight;
        }

        return result;
    }


    public static void Print(List<List<Integer>> result) {
        for(List<Integer> rows : result)
        {
            for(int val :rows)
            {
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

}
