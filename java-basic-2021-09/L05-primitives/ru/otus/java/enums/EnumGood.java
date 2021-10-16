package ru.otus.java.enums;

import java.util.Arrays;

public class EnumGood {
    public static void main(String[] args) {
        // Теперь все хорошо
        createReport(Month.JANUARY);
        createReport(Month.FEBRUARY);
        createReport(Month.DECEMBER);

        // Передать неправильные значения уже не можем
//        createReport(13);
//        createReport(-1);

        System.out.println();
        System.out.println("Все значения:");
        System.out.println(Arrays.toString(Month.values()));
    }

    static void createReport(Month month) {
        int monthNum = month.ordinal() + 1;
        System.out.println("Создан отчет для месяца № " + monthNum + " " + month);
    }
}
