package CollectionsS.LinkedList;

public class Mainn {

    public static void main(String[] args) throws Exception{
        Implementation im = new Implementation();

        im.addlast(10);
        im.addlast(20);
        im.addfirst(00);
        im.addlast(30);
        im.addlast(40);
        im.addlast(50);
        System.out.println("first element : "+im.getfirst());
        System.out.println("last element : "+im.getlast());
        System.out.println("Displaying all elements");
        im.display();
        System.out.println();
        System.out.println("3rd index is "+im.getAt(3));
        System.out.println("3rd index is "+im.getNodeAt(3));
        System.out.println("4th index is "+im.getNodeAt(4));


        System.out.println("Before removing any element");
        im.display();
        System.out.println();

        im.removelast();
        im.removelast();
        System.out.println("After removing last elemnt");
        im.display();
        System.out.println();

        im.removeAt(2);
        System.out.println("After removing 2 elemnt");
        im.display();
        System.out.println();

        im.reverse();
        System.out.println("After Reversing the linked list");
        im.display();
        System.out.println();


    }

}
