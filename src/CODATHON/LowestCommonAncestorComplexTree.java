//class TreeNode {
//    int val;
//    TreeNodee left;
//    TreeNodee right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}
//
//public class LowestCommonAncestorComplexTree {
//
//    public TreeNodee lowestCommonAncestor(TreeNodee root, TreeNodee p, TreeNodee q) {
//        // Base case: if root is null or root is either p or q, return root
//        if (root == null || root == p || root == q) {
//            return root;
//        }
//
//        // Recursively search left and right subtrees
//        TreeNodee left = lowestCommonAncestor(root.left, p, q);
//        TreeNodee right = lowestCommonAncestor(root.right, p, q);
//
//        // If both left and right are not null, then root is the LCA
//        if (left != null && right != null) {
//            return root;
//        }
//
//        // Otherwise, return the non-null subtree result (either left or right)
//        return left != null ? left : right;
//    }
//
//    public static void main(String[] args) {
//        LowestCommonAncestorComplexTree lcaFinder = new LowestCommonAncestorComplexTree();
//
//        // Example complex binary tree setup
//        TreeNodee root = new TreeNodee(1);
//        root.left = new TreeNodee(2);
//        root.right = new TreeNodee(3);
//        root.left.left = new TreeNodee(4);
//        root.left.right = new TreeNodee(5);
//        root.right.left = new TreeNodee(6);
//        root.right.right = new TreeNodee(7);
//        root.left.left.left = new TreeNodee(8);
//        root.left.left.right = new TreeNodee(9);
//
//        TreeNodee p = root.left.left.left; // Node 8
//        TreeNodee q = root.left.left.right; // Node 9
//
//        TreeNodee lca = lcaFinder.lowestCommonAncestor(root, p, q);
//        System.out.println("Lowest Common Ancestor of nodes " + p.val + " and " + q.val + " is: " + lca.val);
//    }
//}
