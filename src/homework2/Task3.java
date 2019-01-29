package homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b and c:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int value = discriminant(a, b, c);
        double root1, root2;

        if (isPositive(value)) {
            root1 = (-b + Math.sqrt(value)) / (2 * a);
            root2 = (-b - Math.sqrt(value)) / (2 * a);
            System.out.println(root1);
            System.out.println(root2);
        } else if (isZero(value)) {
            root1 = (-b + Math.sqrt(value)) / (2 * a);
            System.out.println(root1);
        } else {
            System.out.println("Error: the discriminant is negative.");
        }
    }

    public static boolean isPositive(int value) {
        return value > 0;
    }

    public static boolean isZero(int value) {
        return value == 0;
    }

    public static int discriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }
}