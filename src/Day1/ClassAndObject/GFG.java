package Day1.ClassAndObject;

public class GFG {

    // Driver code
    public static void main(String[] args)
    {
        // Upcasting
        Animal animal = new Dog();  // Upcasting
        animal.makeSound();  // Accessing the method of the superclass

        //downcasting
        Dog dog = (Dog) animal;
        dog.bark();

    }
}