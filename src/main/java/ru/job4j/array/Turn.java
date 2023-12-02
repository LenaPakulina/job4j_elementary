package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int middleNum = array.length / 2;
        for (int i = 0; i < middleNum; i++) {
            int rightIndex = array.length - 1 - i;
            int temp = array[i];
            array[i] = array[rightIndex];
            array[rightIndex] = temp;
        }
        return array;
    }
}
