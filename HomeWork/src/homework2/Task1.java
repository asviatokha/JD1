package homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day, month, year: ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        if (isDateValid(day, month, year)) {
            System.out.println(getTomorrow(day, month, year));
        } else {
            System.out.println("Please enter a valid date.");
        }
    }

    public static String getTomorrow(int day, int month, int year) {
        if (isLastDay(day, month, year)) {
            if (month == 12) {
                day = month = 1;
                year++;
            } else {
                day = 1;
                month++;
            }
        } else {
            day++;
        }
        return formatDate(day, month, year);
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static boolean isDateValid(int day, int month, int year) {
        int startYear = 1970;
        return (year >= startYear && day <= getDays(month, year) && day >= 1);
    }

    public static boolean isLastDay(int day, int month, int year) {
        return getDays(month, year) == day;
    }

    public static String formatDate(int day, int month, int year) {
        return day + "." + month + "." + year;
    }

    public static int getDays(int month, int year) {
        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = isLeapYear(year) ? 29 : 28;
                break;
            default:
                System.out.println("There could be only 12 months!");
                days = -1;
        }
        return days;
    }
}