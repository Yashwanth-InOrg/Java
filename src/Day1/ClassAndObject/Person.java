package Day1.ClassAndObject;

public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() { // Getter - To get the Values
    return name;
  }

  // Setter
  public void setName(String newName) { // Setter - To Set the Values
    this.name = newName;
  }
}