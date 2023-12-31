package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            if ((array[first] + array[last]) == target) {
                return new int[] {first, last};
            } else if (array[first] + array[last] < target) {
                first++;
            } else {
                last--;
            }
        }
        return new int[0];
    }

    public static int[] getIndexesLoops(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int currSum = array[i] + array[j];
                if (target == currSum) {
                    return new int[] {i, j};
                } else if (target < currSum) {
                    break;
                }
            }
        }
        return new int[0];
    }
}
