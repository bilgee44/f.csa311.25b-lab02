package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(10, 5);
        Renderer renderer = new Renderer();

        Shape shape2 = new Circle(10);
        Renderer renderer2 = new Renderer();

        Shape shape3 = new Square(5);
        Renderer renderer3 = new Renderer();

        renderer.render(shape);
        renderer2.render(shape2);
        renderer3.render(shape3);
    }
}
