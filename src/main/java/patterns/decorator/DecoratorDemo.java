package patterns.decorator;

import patterns.decorator.preparation_data.Circle;
import patterns.decorator.preparation_data.RedShapeDecorator;
import patterns.decorator.preparation_data.Shape;

/**
 * The type Decorator demo.
 */
public class DecoratorDemo {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(circle);

        circle.draw();

        redCircle.draw();
    }
}
