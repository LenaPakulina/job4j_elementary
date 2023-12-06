package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
        int result = first - second;
        System.out.println(result);
    }

    public static double minus(int num) {
        return (num - x);
    }

    public static double sum(int num) {
        return (num + x);
    }

    public static double multiply(int num) {
        return (num * x);
    }

    public double divide(int num) {
        return (num / x);
    }

    public double sumAllOperation(int num) {
        return (sum(num) + minus(num)
                + multiply(num) + divide(num));
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sumAllOperation(10));
    }
}
