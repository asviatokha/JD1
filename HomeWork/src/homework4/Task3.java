package homework4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {5, 6, 7};
        System.out.println(Arrays.toString(joinArrays(a1, a2)));

    }

    public static int[] joinArrays(int[] first, int[] second) {
        int[] third = new int[first.length + second.length];

        int pos = 0;
        for (int i = 0; i < first.length && i < second.length; i++) {
            third[pos] = first[i];
            third[++pos] = second[i];
            pos++;
        }

        int minLength = Math.min(first.length, second.length);
        int[] largerArray = first.length == minLength ? second : first;

        for (int i = minLength; i < largerArray.length; i++) {
            third[pos++] = largerArray[i];
        }
        return third;
    }
}
