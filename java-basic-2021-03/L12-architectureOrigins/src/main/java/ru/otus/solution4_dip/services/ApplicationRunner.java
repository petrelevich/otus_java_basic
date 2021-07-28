package ru.otus.solution4_dip.services;

import ru.otus.solution4_dip.domain.User;
import ru.otus.solution4_dip.api.services.CommandHandler;
import ru.otus.solution4_dip.api.services.IOService;
import ru.otus.solution4_dip.api.services.UserService;

import java.util.concurrent.atomic.AtomicBoolean;

public class ApplicationRunner {

    private final IOService ioService;
    private final UserService userService;
    private final CommandHandler commandHandler;

    public ApplicationRunner(IOService ioService,
                             UserService userService,
                             CommandHandler commandHandler) {
        this.ioService = ioService;
        this.userService = userService;
        this.commandHandler = commandHandler;
    }

    public void run() {
        AtomicBoolean executionFlag = new AtomicBoolean(true);

        User user = userService.askUserName();
        while (executionFlag.get()) {
            String commandOrEquation = showPromptAndReadCommand();

            if (!commandHandler.handleExitCommand(commandOrEquation, user.getFullName(), executionFlag)) {
                if (!commandHandler.handleHistoryCommand(commandOrEquation)) {
                    commandHandler.handleEquationCommand(commandOrEquation);
                }
            }
        }
    }

    private String showPromptAndReadCommand() {
        ioService.outputStr("Введите пример или history или exit");
        return ioService.readString("Пример должен состоять из двух чисел отделенных от знака действия пробелами (1 + 1)");
    }
}
