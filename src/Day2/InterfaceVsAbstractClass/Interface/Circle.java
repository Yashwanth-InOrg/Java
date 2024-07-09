package Day2.InterfaceVsAbstractClass.Interface;

class Circle implements Shape { // Class 2 - Helper class
    double pi = 3.14;
    int radius;

    Circle(int radius) { // Parameterized Constructor
        this.radius = radius;
    }

    @Override public void draw() {
        System.out.println("Circle has been drawn ");
    }

    @Override public double area() {
        return (double)((pi * radius * radius));
    }
}