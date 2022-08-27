package ru.otus.solution3_srp.step01;

import ru.otus.solution3_srp.step01.domain.User;
import ru.otus.solution3_srp.step01.services.ConsoleIOService;
import ru.otus.solution3_srp.step01.services.UserService;
import ru.otus.solution3_srp.step01.domain.Equation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Новый класс User
// Отдельные классы для ввода-вывода, работы с пользователем
public class Main {
    public static void main(String[] args) {
        AtomicBoolean executionFlag = new AtomicBoolean(true);
        List<String> historyList = new ArrayList<>();

        ConsoleIOService ioService = new ConsoleIOService();
        UserService userService = new UserService();

        User user = userService.askUserName(ioService);
        while (executionFlag.get()) {
            String commandOrEquation = showPromptAndReadCommand(ioService);

            if (!handleExitCommand(ioService, commandOrEquation, user.getFullName(), executionFlag)) {
                if (!handleHistoryCommand(ioService, commandOrEquation, historyList)) {
                    handleEquationCommand(ioService, commandOrEquation, historyList);
                }
            }
        }
    }

    private static String showPromptAndReadCommand(ConsoleIOService ioService) {
        ioService.outputStr("Введите пример или history или exit");
        return ioService.readString("Пример должен состоять из двух чисел отделенных от знака действия пробелами (1 + 1)");
    }

    private static boolean handleExitCommand(ConsoleIOService ioService, String command, String userName, AtomicBoolean executionFlag) {
        if (!command.equalsIgnoreCase("exit")) {
            return false;
        }
        executionFlag.set(false);
        ioService.outputStr("До свидания, %s", userName);
        return true;
    }

    private static boolean handleHistoryCommand(ConsoleIOService ioService, String command, List<String> historyList) {
        if (!command.equalsIgnoreCase("history")) {
            return false;
        }

        ioService.outputStr("История вычислений:");
        ioService.outputStr(String.join("\n", historyList));
        ioService.outputStr(" ");
        return true;
    }

    private static void handleEquationCommand(ConsoleIOService ioService, String equationStr, List<String> historyList) {
        Equation equation = parseEquation(equationStr);
        if (equation == null) {
            ioService.outputStr("Не верно введен пример!");
            return;
        }

        String solvedEquationString = equationStr + " = " + evaluateEquation(equation);
        ioService.outputStr("Решение: %s%n", solvedEquationString);

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
