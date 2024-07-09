package Day2.InterfaceVsAbstractClass.Interface;

class Rectangle implements Shape { // Class 1 - Helper class

    int length;
    int width;

    Rectangle(int length, int width) { // Parameterized Constructor
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
    }

    @Override
    public double area() {
        return (double)(length * width);
    }
}