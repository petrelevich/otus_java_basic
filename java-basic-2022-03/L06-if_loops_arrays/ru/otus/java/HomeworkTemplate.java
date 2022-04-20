package ru.otus.java;

import java.util.Scanner;

/**
 * Заготовка для выполнения ДЗ "Система тестирования".
 */
public class HomeworkTemplate {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось

        // TODO: Массив вопросов (вместо null надо написать определение массива)
        String[] questions = null;

        // TODO: Массив вариантов ответов
        String[][] answerOptions = null;

        // TODO: Массив правильных ответов
        int[] correctAnswers = null;

        // Примечание - можете придумать как хранить всю информацию в одном массиве

        Scanner scanner = new Scanner(System.in);
        // TODO: Цикл по всем вопросам - исправить, написать правильно
        for(int i = 0; i < 0; i++) {
            // TODO: Вывод вопроса на экран

            // TODO: Вывод вариантов ответов на экран

            System.out.print("Ваш ответ: ");
            //TODO: Считываем с консоли ответ пользователя

            //TODO: Проверяем ответ и выводим результат
            // а также увеличиваем счетчики правильных и неправильных ответов

            System.out.println();
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
