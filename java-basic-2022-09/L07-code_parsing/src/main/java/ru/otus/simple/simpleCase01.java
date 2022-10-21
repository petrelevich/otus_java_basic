package ru.otus.simple;

import java.util.Scanner;

// Найти примерно 7 недочетов. Решить, как будем исправлять.

@SuppressWarnings("all")
public class simpleCase01 {

    public static Integer numberOfRepetitions = 10;
    private static String res = "";

    public static void main(String[] args) {
        getRepeatedString(strReader(), numberOfRepetitions);
    }

    public static String strReader() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void getRepeatedString(String s, Integer numberOfRepetitions) {
        res = s.repeat(numberOfRepetitions);
        System.out.println(res);
    }
}
