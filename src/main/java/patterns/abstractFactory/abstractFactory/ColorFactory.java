package patterns.abstractFactory.abstractFactory;

import patterns.abstractFactory.color.Blue;
import patterns.abstractFactory.color.Color;
import patterns.abstractFactory.color.Green;
import patterns.abstractFactory.color.Red;
import patterns.abstractFactory.shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {

        if (color.equalsIgnoreCase("RED")) {
            return new Red();

        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();

        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else {
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
