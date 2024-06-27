package CollectionsS.TreesS;

import java.util.*;

public class PrintZIgZag {
    public static class Node {
        int data;
        Tree_Traversal.Node left;
        Tree_Traversal.Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        /*
         *                         1
         *                     /      \
         *                   /         \
         *                 2            3
         *               /   \      /      \
         *              4    5     6        7
         *             /\    /\   /\       / \
         *            8  9 10 11 12 13    14 15
         *
         * OP : 1 3 2 4 6 7 15 14 13 12 11 10 9 8
         *
         * */

        Tree_Traversal.Node root = new Tree_Traversal.Node(1);
        root.left = new Tree_Traversal.Node(2);
        root.right = new Tree_Traversal.Node(3);
        root.left.left = new Tree_Traversal.Node(4);
        root.left.right = new Tree_Traversal.Node(5);
        root.right.left = new Tree_Traversal.Node(6);
        root.right.right = new Tree_Traversal.Node(7);
        root.left.left.left = new Tree_Traversal.Node(8);
        root.left.left.right = new Tree_Traversal.Node(9);
        root.left.right.left = new Tree_Traversal.Node(10);
        root.left.right.right = new Tree_Traversal.Node(11);
        root.right.left.left = new Tree_Traversal.Node(12);
        root.right.left.right = new Tree_Traversal.Node(13);
        root.right.right.left = new Tree_Traversal.Node(14);
        root.right.right.right = new Tree_Traversal.Node(15);

//        List<List<Integer>>  result = ZigZag(root);
//        Print(result);

    }

    public static List<List<Integer>> ZigZag(Node root) {
        boolean lefttoright = true;
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
        {
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i =0;i<size;i++)
            {
                Node node = q.poll();
                level.add(node.data );
            }
//            if(){
//
//            }
//
//            if(){
//
//            }

        }
return ans;
    }

    public static void Print(List<List<Integer>> result) {
        for(List<Integer> rows : result)
        {
            for(int val :rows)
            {
                System.out.println(val+" ");
            }
            System.out.println();
        }
    }

}
