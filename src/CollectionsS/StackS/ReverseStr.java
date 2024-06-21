package CollectionsS.StackS;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class ReverseStr {

    public static void main(String[] args) {
        String str = "HelloWorld!";
        Stack<Character> stack = new Stack<>();
        int  i = 0;
        while(i<str.length())
        {
            stack.push(str.charAt(i));
            i++;
        }
        System.out.println(stack);
        StringBuilder strl = new StringBuilder("");
        while (!stack.isEmpty()) {
           strl.append(stack.pop());
        }
        str = strl.toString();
        System.out.println(str);

    }

}
