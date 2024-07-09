package Day2;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Element 1");
        vector.add("Element 2");
        vector.add("Element 3");

        // Insert an element at index 1
        vector.add(1, "New Element");

        // Remove an element by index
        vector.remove(2);

        // Get element at index 0
        String firstElement = vector.get(0);
        System.out.println("First Element: " + firstElement);

        // Set element at index 1
        vector.set(1, "Updated Element");

        // Check if the Vector contains a specific element
        boolean contains = vector.contains("Element 2");
        System.out.println("Contains 'Element 2': " + contains);

        // Get the size of the Vector
        int size = vector.size();
        System.out.println("Size of Vector: " + size);

        // Iterate over elements
        for (String element : vector) {
            System.out.println(element);
        }

        // Clear the Vector
        vector.clear();
        System.out.println("Vector cleared. Size: " + vector.size());
    }
}
