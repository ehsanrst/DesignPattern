package abstractFactory.core.factory;

import abstractFactory.core.color.Blue;
import abstractFactory.core.color.Color;
import abstractFactory.core.color.Green;
import abstractFactory.core.color.Red;
import abstractFactory.core.shape.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();

        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();

        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
