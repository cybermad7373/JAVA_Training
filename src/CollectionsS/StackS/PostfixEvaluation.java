package CollectionsS.StackS;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String[] token = {"2","1","+","3","*"};

        Stack<Integer> stack = new Stack<>();

        for(String i : token)
        {
            int temp = i.charAt(0);
            if(temp == 43 || temp == 45 || temp == 42 || temp == 47)
            { // [ + - * / ]
                int var2 = stack.pop();
                int var1 = stack.pop();
                int ans;
                if(temp == 43){
                    ans = var1+var2;
                } else if (temp == 45) {
                    ans = var1 - var2;
                } else if (temp == 42) {
                    ans = var1 *var2;
                }else {
                    ans = var1/var2;
                }

                stack.push(ans);
            }
            else
            {
                stack.push(Integer.parseInt(i));
            }

        }
        System.out.println(stack.pop());
    }
}
