package Day1;

public class DataTypes {
    public static void main(String[] args) {
        // Data Types: https://www.geeksforgeeks.org/data-types-in-java/
        // Primitive Data Types: https://www.w3schools.com/java/java_data_types.asp
        int myNum = 5;               // Integer (whole number)
        System.out.println(myNum);
        float myFloatNum = 5.99f;    // Floating point number
        System.out.println(myFloatNum);
        char myLetter = 'D';         // Character
        System.out.println(myLetter);
        boolean myBool = true;       // Boolean
        System.out.println(myBool);
        String myText = "Hello";     // String
        System.out.println(myText);

        // TODO: All Primitive Types Max and Min Values
        /*
        SIGNED
         * byte : -128 to 128 (1 byte)
         * short : -32,768 to 32,767 (2 bytes) 
         * int : -2,147,483,648 to 2,147,483,647(4 bytes) = 2^31
         * long : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807  (8 bytes) = 2^63
        UNSIGNED
         * float :	1.4e-045 to 3.4e+038 (4 bytes)
         * double :	4.9e-324 to 1.8e+308 (8 bytes) 
         * char : 0 to 65536 (2 bytes) = 2^16
         * boolean : 1 byte 
         * 
         */

        // TODO: Default Values for Data Types in Global Scope and Local Scope
        /*
         * For numerical types = 0, 0.0f, 0.0d
         * Boolean = false
         * char  = NUL
         */

        // TODO: Local Scope vs Global Scope Examples
        /*
          public class Main
            {
                int a = 100;
                public static void main(String[] args) {
                    Main obj = new Main();
                    int a = 50;
                    System.out.println(a);//prints 50
                    System.out.println(obj.a);//prints 100
                }
            }
         */

        // Non - Primitive Data Types
        // String Literals vs New String Object, String Constant/Literal Pool
        // https://journaldev.nyc3.cdn.digitaloceanspaces.com/2012/11/String-Pool-Java1.png
        String s = "InOrg"; // String Literal
        // Memory Address: https://www.baeldung.com/java-object-memory-address
        System.out.println("hashCode: " + System.identityHashCode(s));
        String s1 = "InOrg";
        System.out.println("hashCode: " + System.identityHashCode(s1));
        String s2 = new String("InOrg");
        System.out.println("hashCode: " + System.identityHashCode(s2));

        // Stack (Primitive Data Types are Present, References to the Object) vs Heap (Objects are Present)

        // TODO: Stack vs Heap - https://www.geeksforgeeks.org/stack-vs-heap-memory-allocation/
        /*
        The stack is used for static memory allocation and manages the execution of threads. Each thread has its own stack, which stores local variables, method call information, and references to objects in the heap. When a method is called, a new block is created on the top of the stack, and when the method execution is complete, the block is removed.

        The heap is used for dynamic memory allocation and stores all Java objects. It is shared among all threads and is managed by the Java Virtual Machine (JVM). Objects created in the heap have global access and are subject to garbage collection, which automatically deallocates memory used by objects that are no longer referenced.
         */

        // TODO: Arrays Example
        /*  
            int[] array;                declaration 
            array = new int[100];       memory allocation
         */

    }
}

/* String Literal
 - If that particular is already present in string pool then it just starts pointing to that
 - If the String is not present in the String then it creates a new String in the String Pool */