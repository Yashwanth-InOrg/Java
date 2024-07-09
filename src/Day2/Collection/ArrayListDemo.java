package Day2.Collection;// Importing all utility classes
import java.util.*;

public class ArrayListDemo { // Main class - ListDemo class

    public static void main(String[] args) { // Main driver method

        // Creating an object of List interface implemented by the ArrayList class
        List<Integer> l1 = new ArrayList<Integer>();
        // ArrayList<Integer> l5 = new ArrayList<>();

        // Adding elements to object of List interface Custom inputs
        l1.add(0, 1);
        l1.add(1, 2);

        // Print the elements inside the object
        System.out.println(l1);

        // Now creating another object of the List interface implemented
        // ArrayList class Declaring object of integer type
        List<Integer> l2 = new ArrayList<Integer>();

        // Again adding elements to object of List interface Custom inputs
        l2.add(1);
        l2.add(2);
        l2.add(3);

        l1.addAll(1, l2); // Will add list l2 from 1 index
        System.out.println(l1);
        l1.remove(1); // Removes element from index 1
        System.out.println(l1); // Printing the updated List 1
        System.out.println(l1.get(3)); // Prints element at index 3 in list 1 using get() method

        l1.set(0, 5); // Replace 0th element with 5 in List 1
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1); // Again printing the updated List 1
    }
}

// ArrayList - An array would be created when it fills around certain
// percentage the length of the array gets double

// Linked List: Data --> Reference

// TODO: Implement one example for Each of the List Set and Queue Implementation with different operations that are present within them