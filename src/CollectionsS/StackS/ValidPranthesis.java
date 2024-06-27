package CollectionsS.StackS;

import java.util.Stack;

public class ValidPranthesis {
    public static void main(String[] args) {
        String str = "(([{}])[]())";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if (current == ')' || current == ']' || current == '}') {
                if (stack.isEmpty()) {
                    System.out.println("In-Valid");
                    return;
                }

                char top = stack.pop();
                if ((current == ')' && top != '(') ||
                        (current == ']' && top != '[') ||
                        (current == '}' && top != '{')) {
                    System.out.println("In-Valid");
                    return;
                }
            }
        }

        ///////////////////////////////////////////////////////////////////////////
//
//        int i =0;
//
//
//        while(i<str.length()){
//            char ch = str.charAt(i);
//            if(ch == '(' || ch== '{' || ch =='['){
//
//            }
//        }
//
//        if (stack.isEmpty()) {
//            System.out.println("Valid");
//        }
//        else{
//            System.out.println("In-Valid");
        }
    }
