package Day2.WrapperTypes;

public class Main {
  public static void main(String[] args) {
    int primitiveInt = 5;
    Integer wrapperInt = primitiveInt; // Autoboxing
    Integer myInt = 5;
    int intValue = myInt; // Unboxing
    Double myDouble = 5.99;
    double primitiveDouble = myDouble; // Unboxing
    Character myChar = 'A';
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
  }
}