package homework6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter upper left x, y:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter bottom right x, y:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (x1 < x2 && y2 < y1) {
            Point a = new Point(x1, y1);
            Point b = new Point(x2, y2);
            Rectangle r = new Rectangle(a, b);
            System.out.println("Diagonal: " + r.getDiagonal());
            System.out.println("Area: " + r.getRectangleArea());
        } else {
            System.out.println("Please enter valid coordinates.");
        }
    }
}
