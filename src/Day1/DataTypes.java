package Day1;

public class DataTypes {
    public static void main(String[] args) {
        int i = 89;
        char a='v';
        byte b = 4;
        // byte b1 = 7888888955;
        short si = 56;
        // larger than short range // short s1 = 87878787878;
        double d = 4.355453532;
        float f = 4.7333434f;  // for float use 'f' as suffix as standard
        long l = 12121;
        float f1 = 35e3f;// scientific numbers
        double d1 = 12E4d;
        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + si);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
        System.out.println(f1);
        System.out.println(d1);
/*
 The String type is so much used and integrated in Java,
 that some call it "the special ninth type". String in Java is actually a non-primitive data type,
  because it refers to an object. The String object has methods that are used to perform certain operations on strings.
 */
        //typecasting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);
        double myD = 9.78d;
        int myI = (int) myD; // Manual casting: double to int

        System.out.println(myD);   // Outputs 9.78
        System.out.println(myI);
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(64));
        // TODO: All Primitive Types Max and Min Values
        String s = "GeeksforGeeks";
// Declare String using new operator
        String s1 = new String("GeeksforGeeks");
        // TODO: Default Values for Data Types in Global Scope and Local Scope
        // TODO: Local Scope vs Global Scope Examples

        // Non - Primitive Data Types
        //arrays
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        //multi dimensional arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7
        // String Literals vs New String Object, String Constant/Literal Pool
        // https://journaldev.nyc3.cdn.digitaloceanspaces.com/2012/11/String-Pool-Java1.png
   /*     String s = "InOrg"; // String Literal
        // Memory Address: https://www.baeldung.com/java-object-memory-address
        System.out.println("hashCode: " + System.identityHashCode(s));
        String s1 = "InOrg";
        System.out.println("hashCode: " + System.identityHashCode(s1));
        String s2 = new String("InOrg");
        System.out.println("hashCode: " + System.identityHashCode(s2));
        */

        // Stack (Primitive Data Types are Present, References to the Object) vs Heap (Objects are Present)
        // TODO: Stack vs Heap - https://www.geeksforgeeks.org/stack-vs-heap-memory-allocation/
        // TODO: Arrays Example
    }
}

/* String Literal
 - If that particular is already present in string pool then it just starts pointing to that
 - If the String is not present in the String then it creates a new String in the String Pool */