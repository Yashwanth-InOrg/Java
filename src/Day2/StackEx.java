package Day2;

import java.util.Stack;
public class StackEx {
    public static void main(String[] args) {
        // Create a Stack of Strings
        Stack<String> stack = new Stack<>();
        // Display the initial state of the stack
        System.out.println("Initial Stack: " + stack);
        // Add elements to the Stack
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");
        System.out.println("Stack after push operations: " + stack);
        // Remove the top element from the Stack
        String removedElement = stack.pop();
        System.out.println("Popped Element: " + removedElement);
        System.out.println("Stack after pop operation: " + stack);
        // View the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
        // Check if the Stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the Stack empty? " + isEmpty);
        // Search for the position of an element in the Stack
        int position = stack.search("Element 1");
        System.out.println("Position of 'Element 1' from top: " + position);
        // Iterate over elements of the Stack
        System.out.println("Iterating over Stack:");
        for (String element : stack) {
            System.out.println(element);
        }
        // Remove all elements from the Stack
        stack.clear();
        System.out.println("Stack cleared. Current Stack: " + stack);
    }
}
