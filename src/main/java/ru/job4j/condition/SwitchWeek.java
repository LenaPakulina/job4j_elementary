package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name = "Ошибка";
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println(nameOfDay(i + 1));
        }
    }
}
