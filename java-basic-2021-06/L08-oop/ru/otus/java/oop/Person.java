package ru.otus.java.oop;

import ru.otus.java.oop.core.Naming;

// Полное имя класса без import:
//public class Person implements ru.otus.java.oop.core.Naming

public class Person implements Naming {
    private String name;
    private Person manager;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Person getManager(){
        return manager;
    }
}
