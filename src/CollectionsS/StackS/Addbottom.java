package CollectionsS.StackS;

import java.util.Stack;

public class Addbottom {
    static Stack<Integer> ans = new Stack<>();

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int val = 5;

        System.out.println(stack);

        //:::::::::::: CALL ANYONE FUNCTION AT A TIME ::::::::::::::

        System.out.println("using second stack " + addWithStack(stack,val));
        //System.out.println("using string var   " + addWithString(stack,val));
        //System.out.println("using recursion    " + addWithRecursion(stack,val));

    }

    public static Stack addWithRecursion(Stack st2, int val)
    {
        ans = st2;
        rec(val);
        return ans;
    }
    public static void rec(int val){
        ans.empty();
        if(!ans.isEmpty()){
            ans.push(val);
            return;
        }
        int temp = ans.pop();
        rec(val);
        ans.push(temp);
    }

    public static Stack addWithStack(Stack st1 , int val)
    {
        ans.empty();

        Stack<Integer> stack = new Stack<>();


        while(!st1.isEmpty())
        {
            stack.push((Integer) st1.peek());
            st1.pop();
        }
        ans.push(val);
        while(!stack.isEmpty())
        {
            ans.push(stack.peek());
            stack.pop();
        }

        return ans;

    }
    public static Stack addWithString(Stack st,int val)
    {
        StringBuilder strl = new StringBuilder("");
        while (!st.isEmpty()) {
            strl.append(st.pop());
        }
        strl.reverse();

        st.push(val);
        int i = 0;
        while (i < strl.length()) {

            int digit = Character.getNumericValue(strl.charAt(i));
            st.push(digit);
            i++;
        }
        return st;
    }
}
