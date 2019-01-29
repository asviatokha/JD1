package homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your number:");
        int value = scanner.nextInt();

        for (int i = 0; ; i++) {
            int res = fibonacciRec(i);
            if (res < value) {
                System.out.println(res);
            } else {
                break;
            }
        }

    }

    public static int fibonacciRec(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRec(n - 1) + fibonacciRec(n - 2);
        }
    }
}



