package ru.otus.solution3_srp.step03.services;

import ru.otus.solution3_srp.step03.domain.Equation;
import ru.otus.solution3_srp.step03.domain.EquationEvaluationResult;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class CommandHandler {

    private static final String EXIT_COMMAND = "exit";
    private static final String HISTORY_COMMAND = "history";

    public boolean handleExitCommand(ConsoleIOService ioService, String command, String userName, AtomicBoolean executionFlag) {
        if (!command.equalsIgnoreCase(EXIT_COMMAND)) {
            return false;
        }
        executionFlag.getAndSet(false);
        ioService.outputStr("До свидания, %s", userName);
        return true;
    }

    public boolean handleHistoryCommand(ConsoleIOService ioService, String command, EquationEvaluationResultHistoryHolder historyHolder) {
        if (!command.equalsIgnoreCase(HISTORY_COMMAND)) {
            return false;
        }
        ioService.outputStr("История вычислений:");
        ioService.outputStr(historyHolder.getHistoryList().stream()
                .map(Objects::toString)
                .collect(Collectors.joining("\n")));
        ioService.outputStr("");
        return true;
    }

    public void handleEquationCommand(ConsoleIOService ioService, String equationStr, EquationEvaluationResultHistoryHolder historyHolder) {
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
