package CollectionsS.LinkedList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AddTwoo {
    public static IntNode addFun(IntNode l1,IntNode l2){
        if(l1 == null && l2 == null){
            return new IntNode(0);
        }

        IntNode temp1 = l1;
        IntNode temp2 = l2;

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while(temp1!=null){
            stack1.push(temp1.data);
            temp1 = temp1.next;
        }
        while(temp2!=null){
            stack2.push(temp2.data);
            temp2 = temp2.next;
        }

        int sum1 = 0;
        while(!stack1.isEmpty()){
            sum1 = sum1  * 10 + stack1.pop();
        }
        int sum2 = 0;
        while(!stack2.isEmpty()){
            sum2 = sum2  * 10 + stack2.pop();
        }
        int res = sum1 + sum2;

        Queue<Integer> queue = new LinkedList<>();
        while(res!=0){
            int rem = res%10;
            queue.add(rem);
            res = res/10;
        }

        IntNode dummy = new IntNode(0);
        IntNode curr = dummy;
        while (!queue.isEmpty()){
            curr.next = new IntNode(queue.poll());
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void print(IntNode head){
        IntNode temp = head;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
     IntNode head1 = new IntNode(2);
     head1.next = new IntNode(4);
     head1.next.next = new IntNode(3);

     IntNode head2 = new IntNode(5);
     head2.next = new IntNode(6);
     head2.next.next = new IntNode(4);

     IntNode ans = addFun(head1,head2);
     print(ans);
    }
}
