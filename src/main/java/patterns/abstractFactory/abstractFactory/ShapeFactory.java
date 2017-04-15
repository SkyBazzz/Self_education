package patterns.abstractFactory.abstractFactory;

import patterns.abstractFactory.color.Color;
import patterns.abstractFactory.shape.Circle;
import patterns.abstractFactory.shape.Rectangle;
import patterns.abstractFactory.shape.Shape;
import patterns.abstractFactory.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else {
            return null;
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
