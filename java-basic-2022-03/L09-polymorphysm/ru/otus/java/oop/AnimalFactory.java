package ru.otus.java.oop;

import ru.otus.java.oop.Animal;
import ru.otus.java.oop.Dog;

public class AnimalFactory {
    public static Animal createAnimal(){
        return new Dog("Феня");
    }
}
