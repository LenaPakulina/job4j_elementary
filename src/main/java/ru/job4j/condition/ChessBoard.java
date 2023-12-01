package ru.job4j.condition;

public class ChessBoard {
    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    private static boolean areAllVariablesValid(int x1, int y1,
                                                int x2, int y2) {
        return isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2);
    }

    private  static boolean isBishopStepValid(int x1, int y1,
                                              int x2, int y2) {
        int absValueX = Math.abs(x1 - x2);
        return absValueX == Math.abs(y1 - y2) && absValueX > 0;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (areAllVariablesValid(x1, y1, x2, y2)) {
            if (isBishopStepValid(x1, y1, x2, y2)) {
                rsl = Math.abs(y1 - y2);
            }
        }
        return rsl;
    }
}
