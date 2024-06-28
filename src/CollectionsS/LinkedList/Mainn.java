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
        System.out.println("Midele element :"+im.FindMiddle());
        System.out.println("Displaying all elements");
        im.display();
        System.out.println("\n\n3rd index is "+im.getAt(3));
        System.out.println("3rd index is "+im.getNodeAt(3));
        System.out.println("4th index is "+im.getNodeAt(4));
        im.InsertAt(4,5000);
        System.out.println("after inserting in 4th pos");
        im.display();


        System.out.println("\nBefore removing any element");
        im.display();

        im.removelast();
        im.removelast();
        System.out.println("\nAfter removing last elemnt");
        im.display();

        im.removeAt(2);
        System.out.println("\nAfter removing 2 elemnt");
        im.display();

        im.reverse();
        System.out.println("\nAfter Reversing the linked list");
        im.display();

        System.out.println("\nAfter Removing 1st element ");
        im.removefirst();
        im.display();
        System.out.println();


        /////////         PALINDROME   [  1 2 3 2 1]
        Implement_Palindrome ip = new Implement_Palindrome();
         ip.cadd('h');
         ip.cadd('e');
         ip.cadd('l');
         ip.cadd('e');
         ip.cadd('h');

         if(ip.checkcharPalindrome()){
             System.out.println("It is Palindrome");
         }else{
             System.out.println("It is Not a Palindrome");
         }

         IntNode ll = new IntNode(1);
         ll.next = new IntNode(2);
         ll.next.next = new IntNode(3);
         ll.next.next.next = new IntNode(0);
         ll.next.next.next.next = new IntNode(1);

//        if(ip.checkintPalindrome(ll)){
//            System.out.println("num ll is Palindrome");
//        }else{
//            System.out.println("num ll is Not a Palindrome");
//        }





    }

}
