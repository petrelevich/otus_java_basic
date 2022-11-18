package ru.otus.solution3_srp.step03;

import ru.otus.solution3_srp.step03.services.*;

// Вынос бизнес-логики из главного класса
// Вынос обработчиков команд в свой класс
public class Main {
    public static void main(String[] args) {
        new ApplicationRunner().run();
    }
}
