package ru.otus.java;

import java.util.Scanner;

public class FirstApp2 {
    static String greeting = "Привет, ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String message = buildMessage(name);
        System.out.println(message);
    }

    private static String buildMessage(String name) {
        String message = FirstApp.greeting + name;
        return message;
    }
}


