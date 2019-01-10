package factory;

import factory.core.Shape;
import factory.core.ShapeFactory;

/**
 * Factory pattern is one of the most used design patterns in Java.
 * This type of design pattern comes under creational pattern
 * as this pattern provides one of the best ways to create an object.
 * <p>
 * In Factory pattern, we create object without exposing the creation logic
 * to the client and refer to newly created object using a common interface.
 */

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //call draw method of Circle
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
