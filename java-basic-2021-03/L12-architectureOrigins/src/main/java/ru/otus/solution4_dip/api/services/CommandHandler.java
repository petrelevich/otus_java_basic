package ru.otus.solution4_dip.api.services;


import java.util.concurrent.atomic.AtomicBoolean;

public interface CommandHandler {

    boolean handleExitCommand(String command, String userName, AtomicBoolean executionFlag);

    boolean handleHistoryCommand(String command);

    void handleEquationCommand(String equationStr);
}
