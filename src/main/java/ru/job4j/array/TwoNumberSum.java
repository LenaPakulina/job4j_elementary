package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int indFirst = 0;
        int indSecond = indFirst + 1;
        while ((array[indFirst] + array[indSecond]) != target) {
            if ((indFirst + 1) == indSecond && indSecond == (array.length - 1)) {
                return new int[0];
            }

            int currSum = array[indFirst] + array[indSecond];
            if (indSecond == (array.length - 1) || currSum > target) {
                indFirst++;
                indSecond = indFirst + 1;
            } else {
                indSecond++;
            }
        }
        return new int[] {indFirst, indSecond};
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
