package abstractFactory.core;

import abstractFactory.core.factory.AbstractFactory;
import abstractFactory.core.factory.ColorFactory;
import abstractFactory.core.factory.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();

        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
