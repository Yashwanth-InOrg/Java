package Day1.inheritanceeg;

public class MultipleEg implements I1,I2{

    @Override
    public void test1() {
        System.out.println("from I1 test1");
    }

    @Override
    public void test2() {
        System.out.println("from I2 test2");
    }

    public static void main(String[] args) {
        MultipleEg obj=new MultipleEg();
        obj.test1();
        obj.test2();
    }
}
