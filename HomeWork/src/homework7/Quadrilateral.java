package homework7;

public abstract class Quadrilateral extends Figure {

    private Point lowerLeft;
    private Point upperLeft;
    private Point upperRight;
    private Point lowerRight;


    public Quadrilateral(Point... points) {
        super(points);
        this.lowerLeft = points[0];
        this.upperLeft = points[1];
        this.upperRight = points[2];
        this.lowerRight = points[3];
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    public double getLength() {
        return lowerRight.getX() - upperLeft.getX();
    }

    public double getWidth() {
        return upperLeft.getY() - lowerRight.getY();
    }

    public double getFirstDiagonal() {
        return upperLeft.getDistance(lowerRight);
    }

    public double getSecondDiagonal() {
        return lowerLeft.getDistance(upperRight);
    }
}