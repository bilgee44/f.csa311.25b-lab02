package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle " + width + "x" + height);
        System.out.println("Area of the rectangle: " + getArea());
    }
}
