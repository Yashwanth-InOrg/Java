package Day2.ThisVsSuper;

class Bike extends Vehicle {
    Bike() { // Constructors
        this("Bike"); // constructor of class Bike
        System.out.println("Bike is created.");
    }

    Bike(String brand) { // Constructor
        super(); // it calls Vehicle(), the parent class
        System.out.println("Bike brand is " + brand);
    }
}