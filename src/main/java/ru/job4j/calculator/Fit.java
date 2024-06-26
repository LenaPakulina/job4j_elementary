package ru.job4j.calculator;

public class Fit {
    private static final short BASE_HEIGHT_MAN = 100;
    private static final short BASE_HEIGHT_WOMAN = 110;
    private static final double WEIGHT_COEFFICIENT = 1.15;

    public static double manWeight(short height) {
        return (height - BASE_HEIGHT_MAN) * WEIGHT_COEFFICIENT;
    }

    public static double womanWeight(short height) {
        return (height - BASE_HEIGHT_WOMAN) * WEIGHT_COEFFICIENT;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man " + height + " is " + man);

        height = 165;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman " + height + " is " + woman);
    }
}
