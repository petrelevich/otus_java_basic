package ru.otus.javabasics;

import com.sun.security.jgss.GSSUtil;

public class Loops {

    public static void main(String[] args) {
        // while
        System.out.println("=== while (i < 5) ===");
        int count = 0;
        while (count < 5) {
            System.out.println(count);
            count++;
        }

        // То же самое с for
        System.out.println("===  for(int i = 0; i < 5; i++) ===");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // В for можно какие-то части опускать
        int j = 0;
        for (; j < 5; j++) {
            System.out.println(10 * j);
        }

        // Может быть, что код никогда не выполнится
        int a = 10;
        int b = 20;

        while (a > b) { // false
            System.out.println("Эта строка не выведется.");
        }

        // то же самое с do while
        do {
            System.out.println("А эта строка будет показана.");
        } while (a > b);

        // Вычисляем числа Фибоначчи
        // Каждое последующее число равно сумме двух предыдущих чисел
        System.out.println("=== Числа Фибонначи ===");
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;

        while (n3 < 100) {
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }

        // Обход массива
        System.out.println("=== Обход массива");
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < daysInMonths.length; i++) {
            System.out.println("Дней в месяце " + (i + 1) + " : " + daysInMonths[i]);
        }
        
        // ----- for each
        System.out.println();
        System.out.println("=== for each");
        String[] answers = new String[]{"aaa", "bbb", "ccc", "ddd"};
        for (String answer : answers) {
            System.out.println(answer);
        }

        // continue
        System.out.println("=== continue");
        // Отображаем нечетные числа
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;

            System.out.println(i);
        }

        // break
        System.out.println("=== break");
        int i = 0;
        while (true) {
            i++;
            if (i > 50)
                break;
        }
        System.out.printf("i = " + i);
    }
}
