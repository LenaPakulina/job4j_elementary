package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int index1 = 0;
        int index2 = index1 + 1;
        while (index1 != index2) {
            if ((array[index1] + array[index2]) == target) {
                return new int[] {index1, index2};
            }
            if (index2 == (array.length - 1)) {
                index1++;
                index2 = (index1 != index2) ? index1 + 1 : index2;
            } else {
                index2++;
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
