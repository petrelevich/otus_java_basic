package ru.otus.java.oop;

public class Company {
    private String namePrivate;
    protected String nameProtected;
    public String namePublic;
    String nameDefault;

    void doSomething() {
        namePrivate = "";
        nameProtected = "";
        namePublic = "";
        nameDefault = "";
    }
}

class SubCompany extends Company {
    public void doSomething() {
//        namePrivate = "";
        nameProtected = "";
        namePublic = "";
        nameDefault = "";
    }
}

class PublicPrivateDemo {
    void doSomething() {
        Company company = new Company();
//        company.namePrivate = "";
        company.nameProtected = "";
        company.namePublic = "";
        company.nameDefault = "";
    }
}
