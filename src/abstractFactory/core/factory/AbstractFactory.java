package abstractFactory.core.factory;

import abstractFactory.core.color.Color;
import abstractFactory.core.shape.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
