package Day1.downcastingeg;

public class DownCastingExample {
    public static void main(String[] args) {
        A ob1=new B();
        System.out.println(ob1.x);
        ob1.test1();
        System.out.println("-----------");
        B ob2=(B)ob1;
        ob2.test1();
        ob2.test2();
        System.out.println(ob2.x);
        System.out.println(ob2.y);
    }
}
