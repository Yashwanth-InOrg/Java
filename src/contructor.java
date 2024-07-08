public class contructor {
    int id;
    String name;
    //creating a parameterized constructor
    contructor(int i,String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        //creating objects and passing values
        contructor s1 = new contructor(111,"Karan");
        contructor s2 = new contructor(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}
