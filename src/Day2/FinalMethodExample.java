package Day2;

// Base class with a final method
class Animal5 {
    // final method
    public final void makeSound() {
        System.out.println("Animal makes sound");
    }
}

// Derived class
class Dog5 extends Animal5 {
    // Attempting to override the final method will result in a compile-time error
    // public void makeSound() {
    //     System.out.println("Dog barks");
    // }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Dog5 dog = new Dog5();
        dog.makeSound();  // Calls the final method from the Animal class
    }
}
