package homework5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String roman = "MMCCCLXIVII";

        if (isValid(roman)) {
            System.out.println(romanToArab(roman));
        } else {
            System.out.println("Your roman number is invalid.");
        }
    }

    public static int romanToArab(String roman) {
        String[] romanValues = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] arabValues = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        for (int i = 0; i < romanValues.length; i++) {
            if (roman.contains(romanValues[i])) {
                roman = roman.replaceAll(romanValues[i], arabValues[i] + " ");
            }
        }
        return Arrays.stream(roman.split(" ")).mapToInt(Integer::parseInt).sum();
    }

    public static boolean isValid(String roman) {
        boolean result = true;

        String[] invalid = {"IIII", "VV", "XXXX", "LL", "CCCC", "DD", "MMMM"};
        for (String value : invalid) {
            if (roman.contains(value)) {
                result = false;
                break;
            }
        }
        return result;
    }
}