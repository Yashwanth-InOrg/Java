package Day2.InterfaceVsAbstractClass.Interface;

public class Main { // Class 3 - Main class
    public static void main(String[] args) { // Main driver method
        // Creating the Object of Rectangle class and using shape interface reference.
        Shape rectangle = new Rectangle(2, 3);
        System.out.println("Area of rectangle: " + rectangle.area());
        // Creating the Objects of circle class
        Shape circle = new Circle(2);
        System.out.println("Area of circle: " + circle.area());
    }
}

// Interface vs Abstract Class: https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/
// TODO: Implement a Sample Example for Abstract Class