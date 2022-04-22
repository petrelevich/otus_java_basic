package ru.otus.java.hw;

import java.util.Scanner;

public class ArrayHw {
    public static void main(String[] args) {
        int rightAns = 0;
        int wrongAns = 0;

        String[][] pollData = {
                {"Если тип данных является монадой - справедливо ли утверждение, что он является функтором?",
                        "да",
                        "нет",
                        "возможно",
                        "1"},
                {"Выберете правильную сигнатуру метода FlatMap в Scala",
                        "flatMap[B](f: A => B): F[B]",
                        "flatMap[B](f: A => F[B]): F[B]",
                        "flatmap[B](f: A => Unit): Unit",
                        "2"},
                {"В Scala тип данных Future является не ленивым(eager) по умолчанию - возможно ли сделать его ленивым(lazy)?",
                        "нет",
                        "да - с помощью () => Future",
                        "да - при объявлении его в for-comprehension",
                        "верны варианты 2 и 3",
                        "4"
                }
        };

        for (String[] question : pollData) {
            for (int i = 0; i < question.length - 1; i++) {
                if (i == 0) System.out.println(question[i]);
                else System.out.println(i +". " + question[i]);

                if (i == question.length - 2) {
                    System.out.println("Ваш ответ: ");
                    String answer = new Scanner(System.in).nextLine().trim();

                    if (answer.equals(question[question.length - 1])) {
                        System.out.println("Правильно");
                        rightAns++;
                    }
                    else {
                        System.out.println("Неправильно");
                        wrongAns++;
                    }
                    System.out.println();
                }
            }
        }

        System.out.println("Результат: правильно " + rightAns + ", неправильно " + wrongAns);
    }
}

