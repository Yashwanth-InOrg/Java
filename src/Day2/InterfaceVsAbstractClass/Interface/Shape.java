package Day2.InterfaceVsAbstractClass.Interface;

// Java Program to Illustrate Concept of Interface
interface Shape {
    static final int value = 10;
    void draw(); // Abstract method
    double area();
    default void sampleMethod() { // Java 8 Feature
        System.out.println("Printing from Default Method");
    }
}

// TODO: Override Default Methods Examples
// TODO: Static and Final Methods in Interfaces
// TODO: Implement Multiple Inheritance using Interfaces