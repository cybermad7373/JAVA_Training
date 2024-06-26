package CollectionsS.QueueS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Queue<Integer> number = new LinkedList<>();
        number.offer(1);
        number.add(2);
        number.offer(3);
        number.add(4);
        number.offer(5);
        number.add(6);
        number.offer(7);
        System.out.println("original val "+number);
        Stack<Integer> stack = new Stack<>();
        while(!number.isEmpty())
        {
            stack.push(number.poll());
        }
        //System.out.println(stack);

        while (!stack.isEmpty())
        {
            number.add(stack.pop());
        }

        System.out.println("After Reversing :"+number);



    }
}
