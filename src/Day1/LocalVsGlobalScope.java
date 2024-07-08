package Day1;

public class LocalVsGlobalScope {

        static int x = 11;
        private int y = 33;
        public void method1(int x)
        {
            LocalVsGlobalScope t = new LocalVsGlobalScope();
            this.x = 22;
            y = 44;

            System.out.println("Test.x: " + LocalVsGlobalScope.x);
            System.out.println("t.x: " + t.x);
            System.out.println("t.y: " + t.y);
            System.out.println("y: " + y);
        }

        public static void main(String args[])
        {
            LocalVsGlobalScope t = new LocalVsGlobalScope();
            t.method1(5);
        }
    }

