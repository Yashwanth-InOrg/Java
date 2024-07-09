package Day2.StaticVsFinal;

public class Child extends Parent { // Class 2 - Sub-class - Extending parent class
    final int age = 10;
    public void surName() { // Method 1 - Trying to override the last name
        System.out.println("New First Name"); // Display surname
    }

    public static void main(String[] args) { // Method 2 - Main driver method
        System.out.println("Printing from Main"); // Display message
        Child child = new Child();
        firstName();
        child.surName();
        // child.age = 20;
    }
}

// Static vs Final: https://www.geeksforgeeks.org/java-final-vs-static-access-modifier/
// TODO: Try Out Examples for Final and Static Attributes

// You can call a static method using an object or directly
// Normal/Regular Method it requires an object for calling it