package patterns.abstract_factory.preparation_data.abstract_factory;

import patterns.abstract_factory.preparation_data.color.Blue;
import patterns.abstract_factory.preparation_data.color.Color;
import patterns.abstract_factory.preparation_data.color.Green;
import patterns.abstract_factory.preparation_data.color.Red;
import patterns.abstract_factory.preparation_data.shape.Shape;

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
