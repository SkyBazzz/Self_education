package patterns.creational_design_patterns.abstract_factory.preparation_data.abstract_factory;

import patterns.creational_design_patterns.abstract_factory.preparation_data.shape.Circle;
import patterns.creational_design_patterns.abstract_factory.preparation_data.shape.Rectangle;
import patterns.creational_design_patterns.abstract_factory.preparation_data.shape.Shape;
import patterns.creational_design_patterns.abstract_factory.preparation_data.color.Color;
import patterns.creational_design_patterns.abstract_factory.preparation_data.shape.Square;

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
