package patterns.creational_design_patterns.abstract_factory.preparation_data.abstract_factory;

import patterns.creational_design_patterns.abstract_factory.preparation_data.color.Color;
import patterns.creational_design_patterns.abstract_factory.preparation_data.shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
