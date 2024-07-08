package Day1.Polymorphism.MethodOverloading;

// Method Overloading, Compile Time Polymorphism, Static Biding
class Helper {

    // Method with 2 integer parameters
    static int Multiply(int a, int b) { // By using Different Types of Arguments
        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b) {
        // Returns product of double numbers
        return a * b;
    }
}