package CollectionsS.TreesS;

public class FirstTree {
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


    static class BinaryTree {
        static int pos = -1;

        public static Node BuildTree(int[] arr) {
            pos++;
            if (arr[pos] == -1) {
                return null;
            }
            Node tree_node = new Node(arr[pos]);
            tree_node.left = BuildTree(arr);
            tree_node.right = BuildTree(arr);

            return tree_node;

        }


        public static void main(String[] args) {
            int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.BuildTree(nodes);
            System.out.println(root.left.data);


        }
    }
}
