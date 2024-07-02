import java.util.Arrays;

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
    public static int[] arr = new int[6];
    public static void main(String[] args) {


        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(7);


        System.out.println(Arrays.toString(Traverse(root,arr,0)));
        int flag = 0;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                    continue;

                if(arr[i]+arr[j]==k)
                {
                    flag = 1;
                }
            }
        }
        if(flag ==0 )
        {
            System.out.println("false");
        }else{System.out.println("true");}
    }

    public static int[] Traverse(Node root,int[] val,int pos){
        if(root == null){
            return val;
        }
        val[pos] = root.data;
        Traverse(root.left,val,pos+1) ;
        Traverse(root.right,val,pos+1) ;
        return val;
    }
}






