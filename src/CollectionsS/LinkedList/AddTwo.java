package CollectionsS.LinkedList;

public class AddTwo {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(3);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);

        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        Node temp = head1;
        while (temp != null) {
            s1.append(temp.data);
            temp = temp.next;
        }

        temp = head2;
        while (temp != null) {
            s2.append(temp.data);
            temp = temp.next;
        }

        s1.reverse();
        s2.reverse();

        System.out.println("Linked list 1: " + s1.toString());
        System.out.println("Linked list 2: " + s2.toString());


        int n1 = Integer.parseInt(s1.toString());
        int n2 = Integer.parseInt(s2.toString());

        int ans = n1+n2;    // 8 0 7

//        Node head3 = new Node();

    }
}
