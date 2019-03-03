package homework7;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(Point... points) {
        super(points);
        if (!(this.getAB() == this.getBC() && this.getAB() == this.getAC() &&
                this.getBC() == this.getAC())) {
            throw new FigureException("Wrong equilateral triangle!");
        }
    }

    @Override
    public double getAltitude() {
        return Math.sqrt(3)/2 * this.getAB();
    }

    @Override
    public double getArea() {
        return getAB() * getAltitude() / 2;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "sideA=" + this.getAB() +
                " sideB=" + this.getBC() +
                " sideC=" + this.getAC() +
                '}';
    }
}