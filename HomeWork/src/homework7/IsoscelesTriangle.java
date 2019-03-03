package homework7;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(Point... points) {
        super(points);
        if (!(this.getAB() == this.getBC() && this.getAB() != this.getAC())) {
            throw new FigureException("Wrong isosceles triangle!");
        }
    }

    @Override
    public double getAltitude() {
        return Math.sqrt(this.getAB() * this.getAB() - (double)(this.getBC() * this.getBC() / 4));
    }

    @Override
    public double getArea() {
        return getAC() * getAltitude() / 2;
    }

    @Override
    public String toString() {
        return "IsoscelesTriangle{" +
                "sideA= " + this.getAB() +
                " sideB=" + this.getBC() +
                " sideC=" + this.getAC() +
                '}';
    }
}