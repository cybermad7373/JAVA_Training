package OOPS;

public class Inheri {
    public static void  main(String[] args){
        Parent o1 = new Parent();
        o1.display();
        System.out.println("------------------------");
        Parent o2 = new child1();
        o2.display();
        System.out.println("------------------------");
        Parent o3 = new child2();
        o3.display();

    }
}
class Parent {
    protected void display(){
        System.out.println("Parent");
    }
}
class child1 extends Parent{
    @Override
    public void display(){
        System.out.println("Child1");
    }
}
class child2 extends child1{
    @Override
    public void display(){
        System.out.println("Chile2");
    }
}
