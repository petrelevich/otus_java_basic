package ru.otus.java;

import java.util.Scanner;

public class FirstApp {
    static String greeting = "Привет, ";

    // Метод main - точка входа в программу
    public static void main(String[] args) {
        /* При запуске программы выполняется код,
            написанный в методе main
        */
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String message = buildMessage(name);
        //TODO: разобраться, что значит System.out.println
        System.out.println(message); // Вывод сообщения на экран

        //JavaDoc для System - https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/System.html#out
    }

    /**
     * Метод генерирует сообщение с приветствием.
     * @param name Имя, кого приветствовать
     */
    private static String buildMessage(String name) {
        String message = FirstApp.greeting + name;
        return message;
    }
}