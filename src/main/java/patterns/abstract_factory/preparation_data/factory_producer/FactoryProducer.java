package patterns.abstract_factory.preparation_data.factory_producer;

import patterns.abstract_factory.preparation_data.abstract_factory.AbstractFactory;
import patterns.abstract_factory.preparation_data.abstract_factory.ColorFactory;
import patterns.abstract_factory.preparation_data.abstract_factory.ShapeFactory;

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
