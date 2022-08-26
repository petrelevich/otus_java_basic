package ru.otus.solution4_dip.api.services;

public interface IOService {

    void outputStr(String s);

    void outputStr(String template, Object ...args);

    String readString();

    String readString(String prompt);
}
