package Day2.InterfaceVsAbstractClass.AbstractClass;

abstract class Subject {
    abstract void syllabus();

    Subject() {
      System.out.println("Learning Subject"); 
    }
   
    void Learn(){
          System.out.println("Preparing Right Now!");
    }
}