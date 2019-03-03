package homework7;

public final class ShapeUtils {

    public static boolean isTriangle(Figure figure) {
        boolean result = false;
        if (figure instanceof Triangle) {
            Triangle triangle = (Triangle) figure;
            if (!(triangle.getAB() + triangle.getBC() <= triangle.getAC() ||
                    triangle.getAB() + triangle.getAC() <= triangle.getBC() ||
                    triangle.getBC() + triangle.getAC() <= triangle.getAB())) {
                result = true;
            }
        }
        return result;
    }

    public static boolean isRectangle(Figure figure) {
        boolean result = false;
        if (figure instanceof Quadrilateral) {
            Quadrilateral rectangle = (Quadrilateral) figure;
            if (Double.compare(rectangle.getFirstDiagonal(), rectangle.getSecondDiagonal()) == 0 &&
                    !(Double.compare(rectangle.getLength(), rectangle.getWidth()) == 0)) {
                result = true;
            }
        }
        return result;
    }
}