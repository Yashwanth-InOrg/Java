package Day1.practice;

public class localglobalscope {
        static int x = 11;
        private int y = 33;
        public void method1(int x)
        {
            localglobalscope t = new localglobalscope();
            this.x = 22;
            y = 44;

            System.out.println("Test.x: " + localglobalscope.x);
            System.out.println("t.x: " + t.x);
            System.out.println("t.y: " + t.y);
            System.out.println("y: " + y);
        }

        public static void main(String args[])
        {
            localglobalscope t = new localglobalscope();
            t.method1(5);
        }
    }
