package CODATHON;

import java.util.*;

class TreeNodee {
    int val;
    TreeNodee left;
    TreeNodee right;

    TreeNodee(int x) {
        val = x;
    }
}

public class TreeTraversals {

    // Preorder traversal using iterative approach (stack)
    public static List<Integer> preorderTraversal(TreeNodee root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Deque<TreeNodee> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNodee node = stack.pop();
            result.add(node.val);

            // Push right child first, then left child (so left is processed first)
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }

        return result;
    }

    // Inorder traversal using iterative approach (stack)
    public static List<Integer> inorderTraversal(TreeNodee root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNodee> stack = new ArrayDeque<>();
        TreeNodee current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }

    // Postorder traversal using iterative approach (two stacks)
    public static List<Integer> postorderTraversal(TreeNodee root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Deque<TreeNodee> stack1 = new ArrayDeque<>();
        Deque<TreeNodee> stack2 = new ArrayDeque<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {
            TreeNodee node = stack1.pop();
            stack2.push(node);

            if (node.left != null) stack1.push(node.left);
            if (node.right != null) stack1.push(node.right);
        }

        while (!stack2.isEmpty()) {
            result.add(stack2.pop().val);
        }

        return result;
    }

    // Level order traversal (Breadth-First Traversal) using Queue
    public static List<Integer> levelOrderTraversal(TreeNodee root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNodee> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNodee node = queue.poll();
            result.add(node.val);

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }

        return result;
    }

    public static void main(String[] args) {
        // Constructing the example tree
        TreeNodee root = new TreeNodee(1);
        root.left = new TreeNodee(2);
        root.right = new TreeNodee(3);
        root.left.left = new TreeNodee(4);
        root.left.right = new TreeNodee(5);
        root.right.left = new TreeNodee(6);
        root.right.right = new TreeNodee(7);

        // Example usage of tree traversals
        System.out.println("Preorder traversal: " + preorderTraversal(root));
        System.out.println("Inorder traversal: " + inorderTraversal(root));
        System.out.println("Postorder traversal: " + postorderTraversal(root));
        System.out.println("Level order traversal: " + levelOrderTraversal(root));
    }
}
