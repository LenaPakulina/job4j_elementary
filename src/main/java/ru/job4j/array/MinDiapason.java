package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        if (finish >= array.length) {
            return -1;
        }
        int min = array[start];
        for (int i = start; (i < array.length) && (i <= finish); i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
