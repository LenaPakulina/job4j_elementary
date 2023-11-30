package ru.job4j.math;

public class MathFunction {
    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double diff(double first, double second) {
        return (first - second);
    }

    public static double customDivision(double first, double second) {
        if (second == 0) {
            return 0;
        }
        return (first / second);
    }
}
