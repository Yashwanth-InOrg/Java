package Day2.ThisVsSuper;

class Bike extends Vehicle {
    Bike() { // Constructors
        this("Bike"); // Constructor of Bike Class
        System.out.println("Bike is created.");
    }

    Bike(String brand) { // Constructor
        super(); // It calls Vehicle(), the Parent Class Constructor
        System.out.println("Bike brand is " + brand);
    }
}