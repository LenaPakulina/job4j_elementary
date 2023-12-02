package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Размер массива равен ages: " + ages.length);
        System.out.println("Размер массива равен surnames: " + surnames.length);
        System.out.println("Размер массива равен prices: " + prices.length);

        String[] names = new String[4];
        for (int i = 0; i < names.length; i++) {
            names[i] = "Random" + i  + " Name" + 1;
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
