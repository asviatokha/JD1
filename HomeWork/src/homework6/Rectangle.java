package homework6;


public class Rectangle {

    private Point upperLeft;
    private Point bottomRight;

    public Rectangle(Point upperLeft, Point bottomRight) {
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    public double getDiagonal() {
        return upperLeft.getDistance(bottomRight);
    }

    public double getRectangleArea() {
        return getLength() * getWidth();
    }

    private int getLength() {
        return bottomRight.getX() - upperLeft.getX();
    }

    private int getWidth() {
        return upperLeft.getY() - bottomRight.getY();
    }

}
