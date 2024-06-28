package CollectionsS.TreesS;

public class CountNodes {
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

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("No of Nodes in the Tree is :"+Count(root));
        addLeaf(root);
        System.out.println("Sum of the leaf Nodes :"+sum);
    }
    static int count = 0;
    static int sum = 0;
    public static int Count(Node root){
        if(root == null){
            return 0;
        }else{
            count++;
        }
        Count(root.left);
        Count(root.right);
     return count;
    }

    public static void addLeaf(Node root)
    {
        if(root == null) {
            return ;
        }
        if(root.left == null && root.right == null)
        {
            sum+=root.data;
            return;
        }

        addLeaf(root.left);
        addLeaf(root.right);
    }

    public static void Depth(Node root){

    }

}
