package CollectionsS.LinkedList;

import java.util.Stack;

public class Implementation
{
    public static class Node
    {
        int data;
        Node next;
    }
    public Node head;
    public Node tail;
    public int size;

    public void addlast(int item)
    {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;


        if(this.size>=1)
        {
            this.tail.next = nn;
        }
        if(this.size == 0)
        {
            this.head = nn;
            this.tail = nn;
            this.size++;
        }
        else{
            this.tail = nn;
            this.size++;
        }
    }

    public void addfirst(int item)
    {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;
        if(this.size>=1)
        {
            nn.next = this.head;
        }
        if(this.size==0)
        {
            this.head = nn;
            this.tail = nn;
            this.size++;
        }
        else{
            this.head = nn;
            this.size++;

        }
    }

    public void display()
    {
        Node temp = this.head;
        while(temp!=null)
        {
            System.out.print(temp.data  + " ");
            temp = temp.next;
        }

    }

    public int getfirst() throws Exception
    {
        if(this.size == 0)
            throw new Exception("linked list is Empty");
        return head.data;
    }
    public int getlast() throws Exception
    {
        if(this.size == 0)
            throw new Exception("linked list is Empty");
        return tail.data;
    }

    public int getAt(int idx) throws Exception
    {
        if(this.size == 0)
            throw new Exception("linked list is Empty");
        if(idx<0 || idx > this.size)
            throw new Exception("Invalid Index");

        Node temp = this.head;
        for(int i = 1;i<idx;i++)
        {
            temp = temp.next;
        }
        return temp.data;
    }

    public Node getNodeAt(int idx) throws Exception
    {
        if(this.size == 0)
            throw new Exception("linked list is Empty");
        if(idx<0 || idx > this.size)
            throw new Exception("Invalid Index");

        Node temp = this.head;
        for(int i = 1;i<idx;i++)
        {
            temp = temp.next;
        }
        return temp.next;
    }

    public void removefirst() throws Exception{
        if(this.size == 0)
            throw new Exception("linked list is Empty");

        if(this.size==1)
        {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }else{
            this.head = this.head.next;
            this.size--;
        }
    }

    public void removelast() throws Exception{
        if(this.size == 0)
            throw new Exception("linked list is Empty");

        if(this.size==1)
        {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }
        this.tail = getNodeAt(this.size-1);
        this.tail.next = null;
        this.size--;
    }

    public void removeAt(int idx) throws Exception{
        if(this.size == 0)
            throw new Exception("linked list is Empty");

        if(this.size==1)
        {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }
        Node nm1 = getNodeAt(idx-1);
        Node np1 = getNodeAt(idx+1);
        nm1.next  = np1;
        this.size--;
    }

    public void reverse(){
        Stack<Integer> stack= new Stack<>();
        Node temp = head;
        while(temp!=null)
        {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp!=null){
            temp.data = stack.pop();

            temp = temp.next;
        }
    }

    public int FindMiddle(){
        Stack<Integer> stack= new Stack<>();
        Node temp = this.head;
        int count = size/2;
        while(temp!=null)
        {
            stack.push(temp.data);
            temp = temp.next;
            count++;
            if(count == size/2);
            {
                return stack.pop();
            }
        }
        return -1;
    }

    public void InsertAt(int inx,int item) throws Exception {

        Node pre = getNodeAt(inx);
        Node post = getNodeAt(inx+1);
        Node nn = new Node();
        nn.data = item;
        pre.next = nn;
        nn.next = post;


    }

}
