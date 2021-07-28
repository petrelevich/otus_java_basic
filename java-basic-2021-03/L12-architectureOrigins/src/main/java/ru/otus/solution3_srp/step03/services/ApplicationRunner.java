package ru.otus.solution3_srp.step03.services;

import ru.otus.solution3_srp.step03.domain.User;

import java.util.concurrent.atomic.AtomicBoolean;

public class ApplicationRunner {

    public void run() {
        AtomicBoolean executionFlag = new AtomicBoolean(true);

        ConsoleIOService ioService = new ConsoleIOService();
        EquationEvaluationResultHistoryHolder historyHolder = new EquationEvaluationResultHistoryHolder();
        UserService userService = new UserService();
        CommandHandler commandHandler = new CommandHandler();

        User user = userService.askUserName(ioService);
        while (executionFlag.get()) {
            String commandOrEquation = showPromptAndReadCommand(ioService);

            if (!commandHandler.handleExitCommand(ioService, commandOrEquation, user.getFullName(), executionFlag)) {
                if (!commandHandler.handleHistoryCommand(ioService, commandOrEquation, historyHolder)) {
                    commandHandler.handleEquationCommand(ioService, commandOrEquation, historyHolder);
                }
            }
        }
    }

    private String showPromptAndReadCommand(ConsoleIOService ioService) {
        ioService.outputStr("Введите пример или history или exit");
        return ioService.readString("Пример должен состоять из двух чисел отделенных от знака действия пробелами (1 + 1)");
    }
}
