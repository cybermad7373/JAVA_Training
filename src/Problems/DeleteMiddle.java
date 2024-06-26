package Problems;

import java.util.Stack;

public class DeleteMiddle
{
    static Stack<Integer> stack = new Stack<>();
    public static void Delete(int size,int current){
        if(current==size/2)
        {
            stack.pop();
            return;
        }
        int top = stack.pop();
        Delete(size,current+1);
        stack.push(top);
    }
    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("original"+ stack);
        int size = stack.size();
        Delete(size, 0);
        System.out.println("after removing middleele : \n"+stack);

    }
}
