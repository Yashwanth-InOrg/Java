package Day1.ClassAndObject;

public class Data {

    private String name;

    //no-args constructor
    // overriding the default constructor
    public Data() {
        System.out.println("No-Args Constructor");
    }

    //Parameterized Constructor
    public Data(String n){
        System.out.println("Parameterized Constructor");
        this.name = n;
    }

    //copy constuctor
    public Data(Data other) {
        this.name = other.name;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Data{name='" + name + "'}";
    }

    public static void main(String[] args) {
        //It’s not required to always provide a constructor implementation in the class code. If we don’t provide a constructor, then java provides default constructor implementation for us to use. Let’s look at a simple program where default constructor is being used since we will not explicitly define a constructor.
        //Default Constructor
        //Data d = new Data();

        //Parameterized Constructor
        Data d = new Data("Java");
        //System.out.println(d.name);

        Data d2 = new Data(d);

        System.out.println(d);
        System.out.println(d2);
    }
}
