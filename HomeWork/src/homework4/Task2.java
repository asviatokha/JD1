package homework4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] a = {1, 1, 3, 1, 2, 1, 2, 5, 5};
        System.out.println(Arrays.toString(removeDuplicates(a)));

    }

    public static int[] removeDuplicates(int[] array) {
        int[] arrayTemp = new int[array.length];
        int pos = 0;

        for (int i : array) {
            if (!isIncluded(arrayTemp, i)) {
                arrayTemp[pos++] = i;
            }
        }

        int[] arrayNew = new int[pos];
        System.arraycopy(arrayTemp, 0, arrayNew, 0, pos);
        return arrayNew;
    }

    public static boolean isIncluded(int[] array, int integer) {
        boolean result = false;
        for (int i : array) {
            if (i == integer) {
                result = true;
                break;
            }
        }
        return result;
    }
}
