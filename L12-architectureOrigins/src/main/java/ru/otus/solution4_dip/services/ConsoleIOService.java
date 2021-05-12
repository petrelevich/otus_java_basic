package ru.otus.solution4_dip.services;

import ru.otus.solution4_dip.api.services.IOService;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleIOService implements IOService {

    private final PrintStream out;
    private final Scanner in;

    public ConsoleIOService() {
        out = System.out;
        in = new Scanner(System.in);
    }

    @Override
    public void outputStr(String s) {
        out.println(s);
    }

    @Override
    public void outputStr(String template, Object ...args) {
        out.printf(template + "%n", args);
    }

    @Override
    public String readString() {
        return in.nextLine();
    }

    @Override
    public String readString(String prompt) {
        outputStr(prompt);
        return readString();
    }
}
