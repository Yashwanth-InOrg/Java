package Day2.Collection;// Importing all utility classes

import java.util.*;

public class SetExample { // Main class

    public static void main(String args[]) { // Main driver method

        // Creating an object of Set class and Declaring object of Integer type
        Set<Integer> a = new HashSet<Integer>();

        // Adding all elements to List 
        a.addAll(Arrays.asList(new Integer[]{1, 3, 2, 4, 8, 9, 0}));

        // Again declaring object of Set class with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));

        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b); // To find union
        System.out.print("Union of the two Set");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b); // To find intersection
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b); // To find the symmetric difference
        System.out.print("Difference of the two Set");
        System.out.println(difference);
    }
}

// Set - Doesn't maintain any order
// HashSet - Maintains the Insertion Order
// TreeSet - Creates a Sorted Set
// TODO: Create an Example for all the 3 Set Implementations