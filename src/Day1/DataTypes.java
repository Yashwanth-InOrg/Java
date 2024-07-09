package Day1;

import java.util.Arrays;

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
        // TODO: Default Values for Data Types in Global Scope and Local Scope
        // TODO: Local Scope vs Global Scope Examples

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
        // TODO: Arrays Example

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        int[] arr1=new int[5];
        for(int i=0;i<arr1.length;i++)
            arr1[i]=i+10;
        System.out.println(Arrays.toString(arr1));
    }
}

/* String Literal
 - If that particular is already present in string pool then it just starts pointing to that
 - If the String is not present in the String then it creates a new String in the String Pool */