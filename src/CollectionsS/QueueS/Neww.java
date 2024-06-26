package CollectionsS.QueueS;

import java.util.LinkedList;
import java.util.Queue;

public class Neww {
    public static void main(String[] args) {
        Queue<Integer> number = new LinkedList<>();
        number.offer(1);
        number.offer(2);
        number.offer(3);
        number.offer(4);
        number.offer(5);
        number.add(6);
        number.add(7);

        System.out.println(number.element());
        System.out.println(number.peek());

        System.out.println(number.remove());
        System.out.println(number.poll());

    }
}

/*
*  offer() - add item to queue , id fails return false
*  add() - add item to quene , if fails throws exception
*
*  element() - takes heas, throws exception if fails
*  peek() - takes head, returns null if empty
*
*  remove() - remove head ,if not found throws exception
*  poll() - removes head ,if not found returns null
*/

