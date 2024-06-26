package CollectionsS.QueueS;

import java.util.*;

public class Dequee {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addLast(2);
        d.addFirst(3);
        d.addLast(4);
        d.addFirst(5);
        d.addLast(6);
        System.out.println("Original : "+d);

        d.removeFirst();
        System.out.println("After removing first"+d);
        d.removeLast();
        System.out.println("After remving last"+d);
    }
}