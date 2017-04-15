package patterns.abstractFactory.abstractFactory;

import patterns.abstractFactory.color.Color;
import patterns.abstractFactory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
