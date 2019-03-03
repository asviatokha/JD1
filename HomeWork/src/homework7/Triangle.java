package homework7;

abstract class Triangle extends Figure {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point... points) {
        super(points);
        this.a = points[0];
        this.b = points[1];
        this.c = points[2];
    }

    abstract double getAltitude();

    abstract double getArea();

    public int getAB() {
        return a.getDistance(b);
    }

    public int getBC() {
        return b.getDistance(c);
    }

    public int getAC() {
        return a.getDistance(c);
    }
}