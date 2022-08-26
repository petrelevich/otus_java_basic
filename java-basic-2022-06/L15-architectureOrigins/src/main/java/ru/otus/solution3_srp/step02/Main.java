package ru.otus.solution3_srp.step02;

import ru.otus.solution3_srp.step02.domain.User;
import ru.otus.solution3_srp.step02.services.ConsoleIOService;
import ru.otus.solution3_srp.step02.services.UserService;
import ru.otus.solution3_srp.step02.domain.Equation;
import ru.otus.solution3_srp.step02.domain.EquationEvaluationResult;
import ru.otus.solution3_srp.step02.services.EquationEvaluationResultHistoryHolder;
import ru.otus.solution3_srp.step02.services.EquationEvaluator;
import ru.otus.solution3_srp.step02.services.EquationParser;


import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        AtomicBoolean executionFlag = new AtomicBoolean(true);

        ConsoleIOService ioService = new ConsoleIOService();
        UserService userService = new UserService();
        EquationEvaluationResultHistoryHolder historyHolder = new EquationEvaluationResultHistoryHolder();

        User user = userService.askUserName(ioService);
        while (executionFlag.get()) {
            String commandOrEquation = showPromptAndReadCommand(ioService);

            if (!handleExitCommand(ioService, commandOrEquation, user.getFullName(), executionFlag)) {
                if (!handleHistoryCommand(ioService, commandOrEquation, historyHolder)) {
                    handleEquationCommand(ioService, commandOrEquation, historyHolder);
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

    private static boolean handleHistoryCommand(ConsoleIOService ioService, String command, EquationEvaluationResultHistoryHolder historyHolder) {
        if (!command.equalsIgnoreCase("history")) {
            return false;
        }

        ioService.outputStr("История вычислений:");
        ioService.outputStr(historyHolder.getHistoryList().stream()
                .map(Objects::toString)
                .collect(Collectors.joining("\n")));
        ioService.outputStr(" ");
        return true;
    }

    private static void handleEquationCommand(ConsoleIOService ioService, String equationStr, EquationEvaluationResultHistoryHolder historyHolder) {
        EquationParser equationParser = new EquationParser();
        Equation equation = equationParser.parseEquation(equationStr);
        if (equation == null) {
            ioService.outputStr("Не верно введен пример!");
            return;
        }

        EquationEvaluator equationEvaluator = new EquationEvaluator();
        EquationEvaluationResult solvedEquation = equationEvaluator.evaluateEquation(equation);
        ioService.outputStr("Решение: %s%n", solvedEquation);

        historyHolder.addEquationEvaluationResult(solvedEquation);
    }
}
