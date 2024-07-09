package Day2;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.addFirst("Orange"); // Adds at the beginning
        linkedList.addLast("Grapes");  // Adds at the end

        // Print the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Get an element at a specific index
        String elementAtIndex2 = linkedList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // Remove an element by index
        linkedList.remove(3);
        System.out.println("LinkedList after removing element at index 3: " + linkedList);

        // Remove a specific element by value
        linkedList.remove("Banana");
        System.out.println("LinkedList after removing 'Banana': " + linkedList);

        // Check if the LinkedList contains an element
        boolean containsCherry = linkedList.contains("Cherry");
        System.out.println("LinkedList contains Cherry: " + containsCherry);

        // Add an element at a specific position
        linkedList.add(2, "Pineapple");
        System.out.println("LinkedList after adding 'Pineapple' at index 2: " + linkedList);

        // Get the first and last elements
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Remove the first and last elements
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after removing first and last elements: " + linkedList);

        // Iterate over the LinkedList
        System.out.println("Iterating over the LinkedList:");
        for (String item : linkedList) {
            System.out.println(item);
        }
    }
}
