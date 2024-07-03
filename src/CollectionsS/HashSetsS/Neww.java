package CollectionsS.HashSetsS;

import java.util.HashSet;
import java.util.Iterator;

public class Neww {
    public static void main(String[] args)
    {
        // Creating an empty HashSet of string entities
        HashSet<String> hs1 = new HashSet<String>();

        // Adding elements using add() method
        hs1.add("Geek");
        hs1.add("For");
        hs1.add("Geeks");

        // Printing all string el=ntries inside the Set
        System.out.println("HashSet elements : " + hs1);

        HashSet<String> hs2 = new HashSet<String>();

        // Adding elements to above Set
        // using add() method
        hs2.add("Geek");
        hs2.add("For");
        hs2.add("Geeks");
        hs2.add("A");
        hs2.add("B");
        hs2.add("Z");

        // Printing the elements of HashSet elements
        System.out.println("Initial HashSet " + hs2);

        // Removing the element B
        hs2.remove("B");

        // Printing the updated HashSet elements
        System.out.println("After removing element " + hs2);

        // Returns false if the element is not present
        System.out.println("Element AC exists in the Set : "
                + hs2.remove("AC"));

        // Add elements to the HashSet
        hs2.add("A");
        hs2.add("B");
        hs2.add("Geeks");
        hs2.add("For");
        hs2.add("Geeks");
        hs2.add("Z");

        // Using iterator() method to iterate over the HashSet
        System.out.print("Using iterator(): ");
        Iterator<String> iterator = hs2.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        System.out.println(); // New line for clarity

        // Using enhanced for loop to iterate over the HashSet
        System.out.print("Using enhanced for loop: ");
        for (String element : hs2) {
            System.out.print(element + ", ");
        }
    }
}
