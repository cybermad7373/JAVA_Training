package CollectionsS.StackS;

import java.util.Stack;

public class ReverseeChar {
    public static void main(String[] args) {


        Stack<Character> str = new Stack<>();
        str.push('h');
        str.push('e');
        str.push('l');
        str.push('l');
        str.push('o');
        while (!str.isEmpty()) {
            System.out.print(str.peek());
            str.pop();
        }

    }
}
