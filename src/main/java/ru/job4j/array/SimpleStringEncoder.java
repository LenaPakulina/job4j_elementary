package ru.job4j.array;

public class SimpleStringEncoder {
    public static String getEncodeUnit(char symbol, int counter) {
        if (counter > 1) {
            return symbol + String.valueOf(counter);
        } else {
            return String.valueOf(symbol);
        }
    }

    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result.append(getEncodeUnit(symbol, counter));
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        return (result + getEncodeUnit(symbol, counter));
    }
}
