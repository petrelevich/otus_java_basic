package ru.otus.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleServiceLogger implements ServiceLogger {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    @Override
    public void log(String message) {
        System.out.printf("%s\t%s\r\n", LocalDateTime.now().format(formatter), message);
    }
}
