package homework7;

public class RightTriangle extends Triangle {

    public RightTriangle(Point... points) {
        super(points);
    }

    @Override
    public double getAltitude() {
        return (double) this.getAB() * this.getAC() / this.getBC();
    }

    @Override
    public double getArea() {
        return (double) this.getAB() * this.getAC() / 2;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "sideA= " + this.getAB() +
                " sideB=" + this.getBC() +
                " sideC=" + this.getAC() +
                '}';
    }
}