package ru.otus.solution1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Запрос ввода имени пользователя
        System.out.println("Введите имя");
        String n = in.nextLine();

        List<String> h = new ArrayList<>();
        while (true) {
            // Запрос ввода команды или примера для расчета
            System.out.println("Введите пример или history или exit");
            System.out.println("Пример должен состоять из двух чисел отделенных от знака действия пробелами (1 + 1)");

            String s = in.nextLine();

            // Обработка команды выхода
            if (s.equalsIgnoreCase("exit")) {
                System.out.printf("До свидания, %s%n", n);
                break;
            } else if (s.equalsIgnoreCase("history")) { // Обработка команды вывода истории
                System.out.println("История вычислений:");
                System.out.println(String.join("\n", h));
                System.out.println();
                continue;
            }

            // Разбор примера
            String[] arr = s.split(" ");
            Integer i1 = null;
            Integer i2 = null;
            String sign = null;
            boolean checked = true;
            try {
                if (arr.length == 3) {
                    i1 = Integer.parseInt(arr[0]);
                    i2 = Integer.parseInt(arr[2]);
                    sign = arr[1];
                }
                checked = i1 != null && sign != null;
            } catch (Exception e) {
                checked = false;
            }

            if (!checked) {
                System.out.println("Не верно введен пример!");
                continue;
            }

            // Расчет примера
            String res = s + " = ";
            switch (sign) {
                case "+" -> res += (i1 + i2);
                case "-" -> res += (i1 - i2);
                case "*" -> res += (i1 * i2);
                case "/" -> res += (i1 / i2);
            }
            System.out.println("Решение: " + res + "\n");
            // Добавление расчета в историю
            h.add(res);
        }
    }
}
