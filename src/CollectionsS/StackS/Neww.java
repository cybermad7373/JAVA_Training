package CollectionsS.StackS;

import java.util.Stack;

public class Neww {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop()+"\n");
        while(!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }

        ///////////////////////////////////////

        StackFunctions s = new StackFunctions();
        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);
        s.push(55);

        int res = s.pop();
        System.out.println("removed element is : "+res);
        while(! s.isEmpty())
        {
            System.out.print(s.peek()+" ");
            s.pop();
        }

    }
}
