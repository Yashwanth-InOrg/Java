package Day1.ClassAndObject;

public class SampleMain {
  public static void main(String[] args) { // Getters and Setters
    Person myObj = new Person();
    // myObj.name = "John"; // error
    // System.out.println(myObj.name); // error
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}