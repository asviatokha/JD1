package homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of days:");
        int days = scanner.nextInt();
        int total = 0;
        int max = 0;

        for (int i = 0; i < days; ++i) {
            System.out.println("Precipitation on day " + (i + 1));
            int daily = scanner.nextInt();
            total += daily;
            if (daily > max) {
                max = daily;
            }
        }

        double avg = (double) total / days;
        String result = "Total precipitation: " + total +
                "\nAvg precipitation: " + avg +
                "\nMax precipitation: " + max;
        System.out.print(result);
    }
}
