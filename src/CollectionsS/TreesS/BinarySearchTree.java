package CollectionsS.TreesS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
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
     /**
     // *   arr = [10,20,30,40,50,60,70]
     // *                 40
     // *                /  \
     // *              20    60
     // *             /  \  /  \
     // *            10  30 50  70
     // *
     // *     BINARY SEARCH TREE  -_-
     // */
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int element : arr) {
            arrayList.add(element);
        }
        Node root = build(arrayList, 0, arr.length - 1);
        LevelOrder(root);
    }

    public static Node build(ArrayList<Integer> val, int min, int max) {
        if (min > max) {
            return null;
        }

        int mid = (min + max) / 2;
        Node head = new Node(val.get(mid));

        head.left = build(val, min, mid - 1);
        head.right = build(val, mid + 1, max);

        return head;
    }

    public static void LevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null){
            q.add(root);
        }else{
            System.out.println("Tree is Empty");
        }
        while(!q.isEmpty())
        {
            Node dummy = q.peek();
            System.out.print(dummy.data+" ");
            if(dummy.left!=null)
            {
                q.add(dummy.left);
            }
            if(dummy.right!=null)
            {
                q.add(dummy.right);
            }
            q.poll();

        }

    }
}
