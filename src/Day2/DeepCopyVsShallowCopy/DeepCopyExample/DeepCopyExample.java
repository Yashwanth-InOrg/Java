package Day2.DeepCopyVsShallowCopy.DeepCopyExample;

public class DeepCopyExample {
    public static void main(String[] args) { // main method
        ABC obj1 = new ABC(); // creating an object of the class ABC
        ABC obj2 = new ABC(); // it will copy the reference, not value
        obj2.x = 6; // updating the value to 6 using the reference variable obj2

        // printing the value of x using reference variable obj1
        System.out.println("The value of x is: " + obj1.x);
    }
}   