package CollectionsS.TreesS;

public class Chk_Identical_Tree {
    public static class Node{
        int data ;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.left = new Node(6);
        root2.right.right = new Node(7);

        if(isSymmetricHelper(root1,root2)){
            System.out.println("Identical");
        }else{
            System.out.println("Non Identical");
        }

    }
    private static boolean isSymmetricHelper(Node left, Node right) {
        if (left == null && right == null)
            return true;

//        if (left == null || right == null)
//            return false;


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
