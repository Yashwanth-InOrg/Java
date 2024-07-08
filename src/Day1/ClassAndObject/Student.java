package Day1.ClassAndObject;

class Student { // Global Scope and Local Scope
    // data member (also instance variable)
    private int id; // Global Variables
    // data member (also instance variable)
    private String name;

    public static void main(String args[]) {
        // creating an object of Student
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
        s1.id = 10;
        s1.name = "yash";
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}

// TODO: Examples for Constructors
/* Constructors
    - Default Constructor
    - NoArgs Constructor
    - Parameterized Constructor
    - Copy Constructor */