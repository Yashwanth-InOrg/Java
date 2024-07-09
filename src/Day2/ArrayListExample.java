package Day2;


import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> list = new ArrayList<>();

        // Add elements to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple"); // Duplicate element

        // Print the list
        System.out.println("List: " + list);

        // Get an element at a specific index
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // Remove an element by index
        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);

        // Check if the list contains an element
        boolean contains = list.contains("Banana");
        System.out.println("List contains Banana: " + contains);

        // Iterate over the list
        System.out.println("Iterating over the list:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
