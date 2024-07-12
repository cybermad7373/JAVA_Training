package CollectionsS.LinkedList;

import java.util.*;
import java.lang.Math;

public class BinaryToDecimal {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(1);    // 1 0 1   -- > 5

        System.out.println("Using Stack  :"+getDecimalValue(head));
       // System.out.println("Using Arrays :"+getDecimalWithArray(head));


    }

    public static int getDecimalValue(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node dummy = head;
        while(dummy!=null)
        {
            stack.push(dummy.data);
            dummy = dummy.next;
        }
        int i =0,sum=0;
        while(!stack.isEmpty())
        {
            sum+= stack.pop()*Math.pow(2, i);
            i++;
        }
        return sum;

    }

//    public static int getDecimalWithArray(Node head){
//        Node dummy = head;
//        ArrayList<Integer> arr = new ArrayList<>();
//        while(dummy!=null)
//        {
//            arr.add(dummy.data);
//            dummy = dummy.next;
//        }
//        int i=0,sum=0;
//        while(!arr.isEmpty())
//        {
//            sum += arr.get(i)*Math.pow(2,i);
//            i++;
//        }
//        return sum;
//
//    }


}