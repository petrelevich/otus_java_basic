package ru.otus.java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Пишем калькулятор
        int a;
        int b;
        char operation;
        int result = 0;

        System.out.println("Введите два числа и операцию (+ или -) через пробел (например, 3 + 7):");

        // Пример как считать ввод пользователя
        // не забудьте - import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        operation = scanner.next().charAt(0);
        b = scanner.nextInt();
        // Подробнее про Scanner - https://vertex-academy.com/tutorials/ru/rabota-so-skannerom-v-java/

        // Логика калькулятора
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            default:
                System.out.println("Неизвестная операция " + operation);
                break;
        }

        // Как переписать в if?

        System.out.println(a + " " + operation + " " + b + " = " + result);
    }
}









/*

Эквивалент switch:

if (operation == '+') {
    result = a + b;
} else if (operation == '-') {
    result = a - b;
} else {
    System.out.println("Неизвестная операция");
}


 */