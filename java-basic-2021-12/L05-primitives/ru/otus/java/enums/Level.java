package ru.otus.java.enums;

// В перечислении могут быть поля, методы и др.

// https://java-blog.ru/osnovy/java-enum-perechisleniya-s-primerami

public enum Level {
    HIGH(3),    // вызов конструктора со значением 3
    MEDIUM(2),  // вызов конструктора со значением 2
    LOW (1)     // вызов конструктора со значением 1
    ; // нужна точка с запятой, если дальше идут поля / методы

    private final int levelCode;

    Level(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return this.levelCode;
    }

}
