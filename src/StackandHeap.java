class Emp {
    int id;
    String emp_name;

    public Emp(int id, String emp_name) {
        this.id = id;
        this.emp_name = emp_name;
    }
}

public class StackandHeap {
    private static Emp StackandHeap(int id, String emp_name) {
        return new Emp(id, emp_name);
    }

    public static void main(String[] args) {
        int id = 21;
        String name = "Maddy";
        Emp person_ = null;
        person_ = StackandHeap(id, name);
    }
}
