package Day1.inheritanceeg;

public class HeirarchicalEg {
    public static void main(String[] args) {
        Car c1 = new Car("A",1000000);
        System.out.println(c1.model);
        System.out.println(c1.price);
        System.out.println("--------------------------");
        Bike b1=new Bike("B",50000);
        System.out.println(b1.model);
        System.out.println(b1.price);
    }
}
