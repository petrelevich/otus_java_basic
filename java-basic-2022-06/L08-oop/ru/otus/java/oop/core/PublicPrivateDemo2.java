package ru.otus.java.oop.core;

import ru.otus.java.oop.Company;

public class PublicPrivateDemo2 {
    void doSomething(){
        Company company = new Company();
//        company.namePrivate = "";
//        company.nameProtected = "";
        company.namePublic = "";
//        company.nameDefault = "";
    }
}
