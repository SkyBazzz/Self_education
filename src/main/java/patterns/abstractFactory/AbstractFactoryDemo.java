package patterns.abstractFactory;

import patterns.abstractFactory.abstractFactory.AbstractFactory;
import patterns.abstractFactory.color.Color;
import patterns.abstractFactory.factoryProducer.FactoryProducer;
import patterns.abstractFactory.shape.Shape;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = FactoryProducer.getFactory("shape");
        Shape shape1 = abstractFactory1.getShape("circle");
        shape1.draw();

        AbstractFactory abstractFactory2 = FactoryProducer.getFactory("COLOR");
        Color color1 = abstractFactory2.getColor("RED");
        color1.fill();

    }
}
