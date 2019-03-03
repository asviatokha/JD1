package homework7;

import java.util.Arrays;

public class Rhombus extends Quadrilateral {

    public Rhombus(Point... points) {
        super(points);
    }

    @Override
    public double getArea() {
        return this.getFirstDiagonal() * this.getSecondDiagonal() / 2;
    }

    @Override
    public String toString() {
        return "Rhombus " + Arrays.toString(super.getPoints());
    }
}