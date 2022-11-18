package ru.otus.solution3_srp.step02.services;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleIOService {

    private final PrintStream out;
    private final Scanner in;

    public ConsoleIOService() {
        out = System.out;
        in = new Scanner(System.in);
    }

    public void outputStr(String s) {
        out.println(s);
    }

    public void outputStr(String template, Object ...args) {
        out.printf(template + "%n", args);
    }

    public String readString() {
        return in.nextLine();
    }

    public String readString(String prompt) {
        outputStr(prompt);
        return readString();
    }
}
