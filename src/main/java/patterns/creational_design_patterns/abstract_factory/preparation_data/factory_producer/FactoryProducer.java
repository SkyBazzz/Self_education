package patterns.creational_design_patterns.abstract_factory.preparation_data.factory_producer;

import patterns.creational_design_patterns.abstract_factory.preparation_data.abstract_factory.ColorFactory;
import patterns.creational_design_patterns.abstract_factory.preparation_data.abstract_factory.ShapeFactory;
import patterns.creational_design_patterns.abstract_factory.preparation_data.abstract_factory.AbstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {

        if (factory.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();

        } else if (factory.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;

    }
}
