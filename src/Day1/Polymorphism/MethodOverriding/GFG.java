package Day1.Polymorphism.MethodOverriding;

// Class 4 - Main class
class GFG {
    // Main driver method
    public static void main(String[] args) {
        // Creating object of class 1
        Parent x;// Defining/Declaring
        x = new Parent();
        x.Print();
        // Now we will be calling print methods inside main() method
        x = new subclass1(); // Initializing
        x.Print();
        x = new subclass2(); // Upcasting
        x.Print();
    }
}

// Upcasting - Reference is of Parent Type and the Object is of Child Type
// Down casting - Reference is of Child Type and the Object is of Parent Type
// TODO: Example of Down casting and Understand why is it not Recommended