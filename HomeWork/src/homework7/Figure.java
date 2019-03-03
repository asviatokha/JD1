package homework7;

public abstract class Figure {

    private Point[] points;

    public Figure(Point... points) {
        this.points = points;
    }

    abstract double getArea();

    public boolean isEqual(Figure figure) {
        return Double.compare(this.getArea(), figure.getArea()) == 0;
    }

    public Point[] getPoints() {
        return points;
    }
}