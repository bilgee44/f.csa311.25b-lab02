package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {

    private final double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    public double getArea() {
        return sideLen * sideLen;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side length " + sideLen);
        System.out.println("Area of the square: " + getArea());
    }
}
