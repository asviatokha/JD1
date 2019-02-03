package homework4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4, 5}};
        System.out.println(Arrays.toString(linearize(array)));
    }

    public static int[] linearize(int[][] array) {
        int lengthFull = 0;
        for (int[] a : array) {
            lengthFull += a.length;
        }

        int[] arrayNew = new int[lengthFull];
        int pos = 0;

        for (int[] a : array) {
            for (int i : a) {
                arrayNew[pos++] = i;
            }
        }
        return arrayNew;
    }
}
