package ru.otus.java.oop;

public class Person {
    private String name;
    private Person manager;

    // геттер для name
    public String getName() {
        return name;
    }

    // сеттер для name
    public void setName(String name) {
        // может быть какая-то валидация, например, name != null
        this.name = name;
    }

    // геттер для manager
    public Person getManager(){
        return manager;
    }

    // сеттера для manager может и не быть
}
