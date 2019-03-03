package homework7;

public final class GeometryDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(0, 3), new Point(4, 3), new Point(4, 0));
        Square square = new Square(new Point(0, 0), new Point(0, 3), new Point(3, 3), new Point(3, 0));
        System.out.println(ShapeUtils.isRectangle(rectangle));
        System.out.println(ShapeUtils.isRectangle(square));
        System.out.println(rectangle.isEqual(square));

        EquilateralTriangle triangle = new EquilateralTriangle(new Point(0, 0), new Point(1, 1), new Point(1, 0));
        IsoscelesTriangle triangle1 = new IsoscelesTriangle(new Point(0, 0), new Point(1, 1), new Point(2, 0));
        System.out.println(ShapeUtils.isTriangle(triangle));
        System.out.println(triangle.getArea());
        System.out.println(triangle1.getArea());
        System.out.println(triangle.isEqual(triangle1));
    }
}