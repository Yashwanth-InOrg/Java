package Day1.practice;


public class constructor {
    int id;
    String name;
    //creating a parameterized constructor
    constructor(int i,String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        //creating objects and passing values
        constructor s1 = new constructor(111,"Karan");
        constructor s2 = new constructor(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}