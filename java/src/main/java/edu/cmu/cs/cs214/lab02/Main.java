package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {

        Renderer renderer = new Renderer();

        Shape shape1 = new Rectangle(10, 5);
        Shape shape2 = new Circle(10);
        Shape shape3 = new Square(5);

        renderer.render(shape1);
        renderer.render(shape2);
        renderer.render(shape3);
    }
}
