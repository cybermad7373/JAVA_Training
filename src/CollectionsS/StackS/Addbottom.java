package CollectionsS.StackS;

import java.util.Stack;

public class Addbottom {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        StringBuilder strl = new StringBuilder("");
        while (!stack.isEmpty()) {
            strl.append(stack.pop());
        }
        strl.reverse();

        stack.push(5);
        int i = 0;
        while (i < strl.length()) {

            int digit = Character.getNumericValue(strl.charAt(i));
            stack.push(digit);
            i++;
        }

        System.out.println(stack);
    }
}
