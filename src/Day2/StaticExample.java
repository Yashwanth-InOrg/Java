package Day2;

class Counter {
    // static variable
    static int count = 0;

    // Constructor to increment the count
    Counter() {
        count++;
        System.out.println("Counter: " + count);
    }

    // static method to display the count
    static void displayCount() {
        System.out.println("Total count: " + count);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // Creating instances of Counter
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Displaying the count using the static method
        Counter.displayCount();
    }
}
