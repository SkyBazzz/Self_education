package patterns.abstractFactory.factoryProducer;

import patterns.abstractFactory.abstractFactory.AbstractFactory;
import patterns.abstractFactory.abstractFactory.ColorFactory;
import patterns.abstractFactory.abstractFactory.ShapeFactory;

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
