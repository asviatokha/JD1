package homework4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(moveRightNTimes(array, 3)));
    }

    public static int[] moveRightNTimes(int[] array, int times) {
        for (int i = 0; i < times; i++) {
            moveRightByOne(array);
        }
        return array;
    }

    public static void moveRightByOne(int[] array) {
        int lastDigitIndex = array.length - 1;
        int lastDigit = array[lastDigitIndex];

        for (int i = lastDigitIndex; i >= 1; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastDigit;
    }
}
