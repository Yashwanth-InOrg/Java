package Day2.CopyConstructor;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person another) { // Copy Constructor - Deep Copy
        this.name = another.name;
        this.age = another.age;
    }
    // Getters and setters for the instance variables
}
