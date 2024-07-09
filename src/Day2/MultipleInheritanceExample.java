package Day2;

// First interface
interface Printable {
    void print();
}

// Second interface
interface Showable {
    void show();
}

// Implementing both interfaces
class MultipleInheritanceExample implements Printable, Showable {
    // Implementing the print method
    public void print() {
        System.out.println("Printing...");
    }

    // Implementing the show method
    public void show() {
        System.out.println("Showing...");
    }

    public static void main(String[] args) {
        MultipleInheritanceExample example = new MultipleInheritanceExample();
        example.print(); // Calls the print method
        example.show();  // Calls the show method
    }
}
