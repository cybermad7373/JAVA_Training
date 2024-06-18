package OOPS;

public class Cons {
    int id;
    String name;
    int val;

    Cons(int i,String n,int v)
    {
        this.id = i;
        this.name = n;
        this. val = v;
    }
    void print()
    {
        System.out.println(this.id + " " + this.name + " " + this.val);

    }

    public static void main(String[] args)
    {
        int i = 10;
        String str= "Ram";
        int n = 15;
        Cons c = new Cons(i,str,n);
        c.print();
    }
}
