package ru.otus.java.oop;

public class Company {
    private String namePrivate;
    protected String nameProtected;
    public String namePublic;
    String nameDefault;

    void doSomething() {
        this.namePrivate = "";
        this.nameProtected = "";
        this.namePublic = "";
        this.nameDefault = "";
    }
}

