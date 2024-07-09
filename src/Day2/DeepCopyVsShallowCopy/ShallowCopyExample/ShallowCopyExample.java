package Day2.DeepCopyVsShallowCopy.ShallowCopyExample;

public class ShallowCopyExample {
    public static void main(String argvs[]) { // main method
        ABC obj1 = new ABC(); // creating an object of the class ABC
        System.out.println("The value of x initially" + obj1.x);
        ABC obj2 = obj1; // it will copy the reference, not value

        // updating the value to 6 using the reference variable obj2
        obj2.x = 6;

        // printing the value of x using reference variable obj1
        System.out.println("The value of x is: " + obj1.x);
    }
}
