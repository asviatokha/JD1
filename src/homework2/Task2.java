package homework2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter plot size:");
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        System.out.println("Enter size for house #1:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Enter size for house #2:");
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int maxHouseSide = Math.max(Math.max(a, b), Math.max(c, d));
        int minHousesLength = Math.min(a, b) + Math.min(c, d);

        if ((e >= minHousesLength && f >= maxHouseSide) || (f >= minHousesLength && e >= maxHouseSide)) {
            System.out.println("You can build two houses on this plot.");
        } else {
            System.out.println("You cannot build two houses on this plot.");
        }

    }
}
