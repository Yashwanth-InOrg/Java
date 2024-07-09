package Day1.constructoreg;

public class Student {
    String name;
    int regno;
    public Student(String name, int regno) {
        this.name = name;
        this.regno = regno;
    }
    public Student(String name)
    {
        this.name = name;
        this.regno = 0;
    }
    public Student()
    {}


    public static void main(String[] args) {

        Student s1=new Student();
        s1.name="A";
        s1.regno=1;
        System.out.println(s1.name);
        System.out.println(s1.regno);
        System.out.println("----------------------------");
        Student s2=new Student("B");
        System.out.println(s2.name);
        System.out.println(s2.regno);
        System.out.println("----------------------------");
        Student s3=new Student("C",3);
        System.out.println(s3.name);
        System.out.println(s3.regno);
    }
}
