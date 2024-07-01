package CollectionsS.TreesS;
import java.util.*;

public class isSymmetricc {
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(44);
        root.left.right = new Node(5);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(Node root) {
        if (root == null)
            return true;

        return isSymmetricHelper(root.left, root.right);
    }

    private static boolean isSymmetricHelper(Node left, Node right) {
        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;
        boolean flag = false;
        if(left.data == right.data && isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
