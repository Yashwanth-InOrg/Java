Java is Call by Value: https://www.geeksforgeeks.org/g-fact-31-java-is-strictly-pass-by-value/
There is only call by value in java, not call by reference. 
If we call a method passing a value, it is known as call by value. 
The changes being done in the called method, is not affected in the calling method.

Deep Copy vs Shallow Copy: https://www.javatpoint.com/shallow-copy-vs-deep-copy-in-java
- https://www.geeksforgeeks.org/difference-between-shallow-and-deep-copy-of-a-class/
- https://www.geeksforgeeks.org/deep-shallow-lazy-copy-java-examples/
- Shallow Copy stores the references of objects to the original memory address. 
- Shallow Copy reflects changes made to the new/copied object in the original object.

- Deep copy stores copies of the object's value.
- Deep copy doesn't reflect changes made to the new/copied object in the original object.

**This vs Super:- Difference Between this() and super() Constructor - https://www.geeksforgeeks.org/super-and-this-keywords-in-java/
- The this() constructor refers to the current class object. 
- It is used for invoking the current class method.
- The super() constructor refers immediate parent class object. 
- It is used for invoking parent class methods.**

Static vs Final:
- Static is used to access the attributes and methods directly with out the necessity of an Object
- Final Class cannot be Inherited
- Final Method cannot be Overridden
- Final Attribute must be initialized and it cannot be modified once defined

Interface vs Abstract Class

Abstract Class: https://www.geeksforgeeks.org/abstract-classes-in-java/
An abstract class is a special type of class in object-oriented programming that cannot be instantiated directly. 
Instead, it serves as a blueprint or template for other classes to be derived from. 
- Cannot be instantiated: Abstract classes cannot be directly instantiated, 
  which means you cannot create objects of an abstract class.
- Contains at least one pure virtual function: Abstract classes must contain at least  
  one pure virtual function, which means that the function has no implementation and 
  must be implemented by any derived classes.
- Can contain both abstract and non-abstract methods: Abstract classes can have 
  both abstract and non-abstract methods. Non-abstract methods have a complete implementation 
  and can be called directly.
- Can have constructors and destructors: Abstract classes can have constructors and destructors 
  like any other class.
- Can have member variables: Abstract classes can have member variables, which are variables 
  that belong to an object of the class.
- Can be used as a base class: Abstract classes can be used as a base class for other classes, 
  which means that they can be inherited by other classes.

Features of An Interface: https://www.geeksforgeeks.org/default-methods-java/
https://www.geeksforgeeks.org/can-we-override-default-method-in-java/
- Defines a set of methods and properties: An interface defines a set of methods and properties that 
  must be implemented by any class or structure that implements the interface.
- Provides a common protocol: Interfaces provide a common protocol that allows different software 
  components to communicate with each other.
- Supports polymorphism: An interface can be used to achieve polymorphism, which means that objects 
  of different classes can be treated as if they belong to the same type, as long as they implement 
  the same interface.
- Enables separation of concerns: Interfaces enable separation of concerns, which means that different 
  parts of a software system can be developed independently of each other, as long as they adhere 
  to the interface specifications.
- Improves code reusability: Interfaces improve code reusability by allowing different software 
  components to reuse the same code base, as long as they implement the same interface.
- Enforces design patterns: Interfaces can be used to enforce design patterns, such as the Adapter 
  pattern, by requiring that certain methods or properties be implemented by the implementing classes.
- Facilitates testing: Interfaces facilitate testing by allowing software components to be tested 
  independently of each other, using mock objects that implement the interface.

https://jojozhuang.github.io/programming/java-advanced-shallow-copy-vs-deep-copy/

Interfaces could have only abstract methods before Java 8. 
The classes separately provide implementation to these methods. 
So, if a new method is to be added to an interface, 
then its implementation code has to be provided in the class implementing the same interface. 
For overcoming this issue, Java 8 introduced the concept of default methods that allow the 
interfaces to have methods with implementation without affecting the classes that implement the interface.

Class Extends a Class
Class Implements an Interface
Interface Extends an Interface

Java is not 100% Object Oriented - Why --> Primitive Data Types
Collections only works with Objects --> It wont work with primitive Data Types
Generics - Type Safety

ForName Method - https://www.geeksforgeeks.org/class-forname-method-in-java-with-examples/
Copy Constructor - https://www.geeksforgeeks.org/copy-constructor-in-java/
Collection Interface - https://www.geeksforgeeks.org/collection-interface-in-java-with-examples/
  - https://www.javatpoint.com/collections-in-java
Generics - https://www.geeksforgeeks.org/generics-in-java/
Wrapper Classes - https://www.w3schools.com/java/java_wrapper_classes.asp
AutoBoxing and UnBoxing - https://www.geeksforgeeks.org/autoboxing-unboxing-java/

Collection - Interface
Collections - Class - Various Methods for performing different operations on collection