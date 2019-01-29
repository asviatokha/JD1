package homework3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your integer: ");
        int number = scanner.nextInt();
        int result = 0;

        while (number / 10 != 0 || number % 10 != 0) {
            result += number % 10;
            number /= 10;
        }
        System.out.println("The sum is: " + result);
    }
}
