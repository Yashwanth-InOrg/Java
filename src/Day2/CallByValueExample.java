package Day2;

public class CallByValueExample {
    static int add(int a, int b) { // a and b are the parameters for the add method.
        a += b; // The addition of two values is done using the sum
        return a;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        add(a, b); // function and the values of a does not change.
        System.out.println("After the add function a = " + a);
        System.out.println("After the add function b = " + b);
    }
}

// TODO: Create an Object Pass that Object to a Method Modify the Object
// When you pass a value to a method a copy of the value would be passed
// When you pass an object to a method then a copy of the reference would be passed