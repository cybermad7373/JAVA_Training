package Problems;

import java.util.Stack;

public class ChemicalFormula {
    public static void main(String[] args) {
        String str =  "K4(ON(SO3)2)2";   // OP : "K4N2O14S4"

        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<str.length();i++)
        {
            stack.push(str.charAt(i));
        }
    }
}
