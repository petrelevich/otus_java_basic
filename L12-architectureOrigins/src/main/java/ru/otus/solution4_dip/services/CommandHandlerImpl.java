package ru.otus.solution4_dip.services;

import ru.otus.solution4_dip.domain.Equation;
import ru.otus.solution4_dip.domain.EquationEvaluationResult;
import ru.otus.solution4_dip.api.services.*;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class CommandHandlerImpl implements CommandHandler {

    private static final String EXIT_COMMAND = "exit";
    private static final String HISTORY_COMMAND = "history";

    private final IOService ioService;
    private final EquationEvaluationResultHistoryHolder historyHolder;
    private final EquationParser equationParser;
    private final EquationEvaluator equationEvaluator;

    public CommandHandlerImpl(IOService ioService,
                              EquationEvaluationResultHistoryHolder historyHolder,
                              EquationParser equationParser,
                              EquationEvaluator equationEvaluator) {
        this.ioService = ioService;
        this.historyHolder = historyHolder;
        this.equationParser = equationParser;
        this.equationEvaluator = equationEvaluator;
    }

    public boolean handleExitCommand(String command, String userName, AtomicBoolean executionFlag) {
        if (!command.equalsIgnoreCase(EXIT_COMMAND)) {
            return false;
        }
        executionFlag.getAndSet(false);
        ioService.outputStr("До свидания, %s", userName);
        return true;
    }

    public boolean handleHistoryCommand(String command) {
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

    public void handleEquationCommand(String equationStr) {
        Equation equation = equationParser.parseEquation(equationStr);
        if (equation == null) {
            ioService.outputStr("Не верно введен пример!");
            return;
        }

        EquationEvaluationResult solvedEquation = equationEvaluator.evaluateEquation(equation);
        ioService.outputStr("Решение: %s%n", solvedEquation);

        historyHolder.addEquationEvaluationResult(solvedEquation);
    }
}
