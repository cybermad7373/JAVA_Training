package CollectionsS.QueueS;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_k_element {

    public static void main(String[] args) {
        Queue<Integer> nums = new LinkedList<>();
        nums.offer(1);
        nums.offer(2);
        nums.offer(3);
        nums.offer(4);
        nums.offer(5);
        nums.offer(6);
        int k =3;
        rev1(nums,k);
    }

    public static void rev1(Queue q, int k)
    {
        Deque<Integer> d = new LinkedList<>();
        for(int i = 0;i<k;i++)
        {
            d.addFirst((Integer)q.poll());
        }
        while (!q.isEmpty())
        {
            d.addLast((Integer)q.poll());
        }
        System.out.println(d);
    }
}
