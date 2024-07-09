package Day2;

import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();
        // Display the initial state of the queue
        System.out.println("Initial Queue: " + queue);
        // Add elements to the Queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");
        System.out.println("Queue after add operations: " + queue);
        // Peek at the front element of the Queue
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);
        // Remove an element from the Queue
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Queue after poll operation: " + queue);
        // Check if the Queue contains a specific element
        boolean containsElement = queue.contains("Element 2");
        System.out.println("Queue contains 'Element 2': " + containsElement);
        // Get the size of the Queue
        int size = queue.size();
        System.out.println("Size of Queue: " + size);
        // Iterate over elements of the Queue
        System.out.println("Iterating over Queue:");
        for (String element : queue) {
            System.out.println(element);
        }
        // Clear the Queue
        queue.clear();
        System.out.println("Queue cleared. Current Queue: " + queue);
    }
}
