package CollectionsS.LinkedList;

import java.util.Stack;

public class Implement_Palindrome {

    public class cNode
    {
        char cdata;
        cNode cnext;
//        cNode(char data)
//        {
//            this.data = data;
//            this.next = null;
//        }    // this is defined id we directeely add list elements head.next = (value) ||  head.next.next = (val)
    }

    public cNode chead;
    public cNode ctail;
    public int csize;


    public boolean checkcharPalindrome()
    {
        Stack<Character> stack= new Stack<>();
        cNode temp = chead;
        while(temp!=null)
        {
            stack.push(temp.cdata);
            temp = temp.cnext;
        }
        temp = chead;

        while(temp!=null)
        {
            //System.out.println(temp.data + " " + stack.peek());
            if(temp.cdata != stack.pop()){

                return false;
            }
            temp = temp.cnext;
        }
        return true;
    }

//    public boolean checkintPalindrome(IntNode head)
//    {
//        Stack<Integer> stack= new Stack<>();
//        IntNode temp = head;
//        while(temp!=null)
//        {
//            stack.push(temp.data);
//            temp = temp.next;
//        }
//        temp = head;
//
//        while(temp!=null)
//        {
//            //System.out.println(temp.data + " " + stack.peek());
//            if(temp.data != stack.pop()){
//
//                return false;
//            }
//            temp = temp.next;
//        }
//        return true;
//    }




    public void cadd(char item)
    {
        cNode nn =  new cNode();
        nn.cdata = item;
        nn.cnext = null;

        if(this.csize>=1)
        {
            this.ctail.cnext = nn;
        }
        if(this.csize == 0)
        {
            this.chead = nn;
            this.ctail = nn;
            this.csize++;
        }
        else{
            this.ctail = nn;
            this.csize++;
        }
    }
}
