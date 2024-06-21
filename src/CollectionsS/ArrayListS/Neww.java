package CollectionsS.ArrayListS;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Neww {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(44);
        list.add(3);
        list.add(8);
        list.add(5);
        System.out.println(list);
        System.out.println(list.get(1)); //index of 1
        list.set(4,6);         /// 6 at index 4
        System.out.println(list);
        list.remove(3);
        System.out.println(list.contains(3));      //false
        Collections.sort(list);
        System.out.println(list);
    }
}
