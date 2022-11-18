package ru.otus.solution2_kissdry.step03;

import ru.otus.solution2_kissdry.step03.domain.Equation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

// Рефакторинг handleEquationCommand
// Новый класс Equation и методы по его формированию из строки и решению
public class Main {
    public static void main(String[] args) {
        AtomicBoolean executionFlag = new AtomicBoolean(true);

        Scanner in = new Scanner(System.in);

        List<String> historyList = new ArrayList<>();

        String userName = askUserName(in);
        while (executionFlag.get()) {
            String commandOrEquation = showPromptAndReadCommand(in);

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
        Equation equation = parseEquation(equationStr);
        if (equation == null) {
            outputStr("Не верно введен пример!");
            return;
        }

        String solvedEquationString = equationStr + " = " + evaluateEquation(equation);
        outputStr("Решение: %s%n", solvedEquationString);

        historyList.add(solvedEquationString);
    }

    private static Equation parseEquation(String equationString) {
        String[] arr = equationString.split(" ");
        try {
            if (arr.length != 3) {
                throw new IllegalArgumentException();
            }

            int leftSide = Integer.parseInt(arr[0]);
            int rightSide = Integer.parseInt(arr[2]);
            char sign = arr[1].charAt(0);

            if (sign != '+' && sign != '-' && sign != '*' && sign != '/') {
                throw new IllegalArgumentException();
            }

            return new Equation(leftSide, rightSide, sign);
        } catch (Exception ignored) {
        }
        return null;
    }

    private static int evaluateEquation(Equation equation) {
        int equationResult = 0;
        switch (equation.getSign()) {
            case '+' -> equationResult = (equation.getLeftSide() + equation.getRightSide());
            case '-' -> equationResult = (equation.getLeftSide() - equation.getRightSide());
            case '*' -> equationResult = (equation.getLeftSide() * equation.getRightSide());
            case '/' -> equationResult = (equation.getLeftSide() / equation.getRightSide());
        }
        return equationResult;
    }
}
