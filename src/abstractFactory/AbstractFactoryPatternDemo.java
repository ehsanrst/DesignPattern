package abstractFactory;

import abstractFactory.core.FactoryProducer;
import abstractFactory.core.color.Color;
import abstractFactory.core.factory.AbstractFactory;
import abstractFactory.core.shape.Shape;

/**
 * Abstract Factory patterns work around a super-factory which creates other factories.
 * This factory is also called as factory of factories.
 * This type of design pattern comes under creational pattern as this pattern
 * provides one of the best ways to create an object.
 * <p>
 * In Abstract Factory pattern an interface is responsible for creating a factory of related objects
 * without explicitly specifying their classes.
 * Each generated factory can give the objects as per the 'Factory pattern'.
 */

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        //get core factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //call draw method of Shape Circle
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color Red
        Color color1 = colorFactory.getColor("RED");
        //call fill method of Red
        color1.fill();

        Color color2 = colorFactory.getColor("Green");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }

}
