public class LocalGlobalScope {
    static int x = 11;
    private int y = 33;
    public void method1(int x)
    {
        LocalGlobalScope t = new LocalGlobalScope();
        this.x = 22;
        y = 44;

        System.out.println("Test.x: " + LocalGlobalScope.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

    public static void main(String args[])
    {
        LocalGlobalScope t = new LocalGlobalScope();
        t.method1(5);
    }
}
