package patterns.creational_design_patterns.abstract_factory;

import patterns.creational_design_patterns.abstract_factory.preparation_data.abstract_factory.AbstractFactory;
import patterns.creational_design_patterns.abstract_factory.preparation_data.color.Color;
import patterns.creational_design_patterns.abstract_factory.preparation_data.factory_producer.FactoryProducer;
import patterns.creational_design_patterns.abstract_factory.preparation_data.shape.Shape;

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
