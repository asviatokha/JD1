package homework7;

import java.util.Arrays;

public class Square extends Quadrilateral {

    public Square(Point... points) {
        super(points);
    }

    @Override
    public String toString() {
        return "Square " + Arrays.toString(super.getPoints());
    }
}