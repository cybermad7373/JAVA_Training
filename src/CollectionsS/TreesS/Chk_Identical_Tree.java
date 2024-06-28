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
        root2.right.left = new Node(66);
        root2.right.right = new Node(7);

        check(root1,root2);
        if(flag){
            System.out.println("Equal");
        }else{
            System.out.println("Not-Equal");
        }
    }
    static boolean flag = false;
    public static void check(Node tree1,Node tree2){
        {
            if(tree1.left == null ||tree2.left == null || tree1.right == null || tree2.right == null){
                return;
            }
            if(tree1.left.data == tree2.left.data && tree1.right.data == tree2.right.data)
            {
                flag = true;
            }
            else{
                flag = false;
                return;
            }
            check(tree1.left,tree2.left);
            check(tree2.right,tree2.right);
        }
    }

}
