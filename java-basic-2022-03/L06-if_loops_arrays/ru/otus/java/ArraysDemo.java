package ru.otus.java;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // Надо хранить и как-то обрабатывать пять значений.
        // Например, посчитать их сумму.
        // Можно сделать так:
        int number1 = 100;
        int number2 = 200;
        int number3 = 300;
        int number4 = 400;
        int number5 = 500;

        int sum = number1 + number2 + number3 + number4 + number5;
        System.out.println("Сумма: " + sum);
        // Но это неудобно. Почему?

        // Объявление массива и выделение памяти под пять элементов
        int[] numbers; // здесь массива еще нет, здесь мы его только объявили
        numbers = new int[5]; // а здесь выделяем под него память
        // new - специальная операция для выделения памяти
        // Элементы массива инициализируются значениями по умолчанию

        // Можно объединить объявление и выделение памяти:
        //int[] numbers = new int[5];

        // задаем значения элементов массива через квадратные скобки []
        // нумерация с 0, а не с 1
        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        numbers[3] = 400;
        numbers[4] = 500;

        System.out.println("Элемент с индексом 0: " + numbers[0]);
        System.out.println("Элемент с индексом 1: " + numbers[1]);
        System.out.println("Элемент с индексом 2: " + numbers[2]);
        System.out.println("Элемент с индексом 3: " + numbers[3]);
        System.out.println("Элемент с индексом 4: " + numbers[4]);
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Arrays.toString(): " + Arrays.toString(numbers));

        //  Считаем сумму
        int sumArray = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];

        // Можно с помощью цикла
        // Посмотрим отладчик
        int sumArrayLoop = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumArrayLoop += numbers[i];
        }
        System.out.println("Сумма элементов массива: " + sumArrayLoop);


        // См. слайды

        // Инициализатор массива
        System.out.println("=== Инициализатор массива");
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Дней в феврале: " + daysInMonths[2]); // Правильно? Нет ошибки?

        System.out.println("=== Многомерные массивы");
        // Многомерные массивы - массивы массивов
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);

        int[][] matrix = {
                {0, 0, 0, 0, 0},
                {0, 1, 2, 3, 4},
                {0, 2, 4, 6, 8},
                {0, 3, 6, 9, 12},
                {0, 4, 8, 12, 16}
        };
        System.out.println(matrix[2][3]);
        //Чуть позже посмотрим как делать обход массива

        // Массив перечислений
        System.out.println("=== enum");
        System.out.println(Month.JANUARY);

        Month[] summerMonths = new Month[3];
        System.out.println(summerMonths[0]);
        System.out.println(summerMonths[1]);
        System.out.println(summerMonths[2]);

        summerMonths[0] = Month.JUNE;
        summerMonths[1] = Month.JULY;
        summerMonths[2] = Month.AUGUST;
        System.out.println("----");
        System.out.println(summerMonths[0]);
        System.out.println(summerMonths[1]);
        System.out.println(summerMonths[2]);

        // ArrayIndexOutOfBoundsException
        System.out.println(summerMonths[3]);
    }

    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
}
