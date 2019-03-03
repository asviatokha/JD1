package homework7;

import java.util.Arrays;

public class Rectangle extends Quadrilateral {

    public Rectangle(Point... points) {
        super(points);
    }

    @Override
    public String toString() {
        return "Rectangle" + Arrays.toString(super.getPoints());
    }
}