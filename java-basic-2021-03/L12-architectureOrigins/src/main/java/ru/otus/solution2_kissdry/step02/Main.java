package ru.otus.solution2_kissdry.step02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Запрос ввода имени пользователя
        String userName = askUserName(in);

        List<String> historyList = new ArrayList<>();
        AtomicBoolean executionFlag = new AtomicBoolean(true);
        while (executionFlag.get()) {
            // Запрос ввода команды или примера для расчета
            String commandOrEquation = showPromptAndReadCommand(in);

            // Обработка команды выхода
            if (!handleExitCommand(commandOrEquation, userName, executionFlag)) {
                if (!handleHistoryCommand(commandOrEquation, historyList)) {
                    handleEquationCommand(commandOrEquation, historyList);
                }
            }
        }
    }

    private static void outputStr(String s) {
        System.out.println(s);
    }

    private static void outputStr(String template, Object ...args) {
        System.out.printf(template + "%n", args);
    }

    private static String askUserName(Scanner in) {
        outputStr("Введите имя");
        return in.nextLine();
    }

    private static String showPromptAndReadCommand(Scanner in) {
        outputStr("Введите пример или history или exit");
        outputStr("Пример должен состоять из двух чисел отделенных от знака действия пробелами (1 + 1)");

        return in.nextLine();
    }


    private static boolean handleExitCommand(String command, String userName, AtomicBoolean executionFlag) {
        if (!command.equalsIgnoreCase("exit")) {
            return false;
        }
        executionFlag.set(false);
        outputStr("До свидания, %s", userName);
        return true;
    }

    private static boolean handleHistoryCommand(String command, List<String> historyList) {
        if (!command.equalsIgnoreCase("history")) {
            return false;
        }

        outputStr("История вычислений:");
        outputStr(String.join("\n", historyList));
        outputStr(" ");
        return true;
    }

    private static void handleEquationCommand(String equationStr, List<String> historyList) {
        // Разбор примера
        String[] arr = equationStr.split(" ");
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
            outputStr("Не верно введен пример!");
            return;
        }

        // Расчет примера
        String solvedEquationString = equationStr + " = ";
        switch (sign) {
            case "+" -> solvedEquationString += (i1 + i2);
            case "-" -> solvedEquationString += (i1 - i2);
            case "*" -> solvedEquationString += (i1 * i2);
            case "/" -> solvedEquationString += (i1 / i2);
        }
        outputStr("Решение: %s%n", solvedEquationString);
        // Добавление расчета в историю
        historyList.add(solvedEquationString);
    }

}
