package ru.otus.java.example02;

import java.util.HashMap;
import java.util.Map;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

class Address {
    public String city;     // Поля специально public
    public String street;   // чтобы сократить код
    public String building; // на это не обращаем внимания

    public Address(String city, String street, String building) {
        this.city = city;
        this.street = street;
        this.building = building;
    }
}

// Что делает программа?
// Какой будет вывод?
// Не обращать внимание на прямое обращение к полям.
// Здесь ошибка, изменять структуру классов не надо.
public class Example02 {
    public static void main(String[] args) {
        Map<Person, Address> personAddresses = getPersonAddresses();

        Person petrov = new Person("Петров");
        Address petrovAddress = personAddresses.get(petrov);
        System.out.println(petrovAddress.city);
        System.out.println(petrovAddress.building);
        System.out.println(petrovAddress.street);
    }

    private static Map<Person, Address> getPersonAddresses() {
        Person person1 = new Person("Иванов");
        Person person2 = new Person("Петров");
        Person person3 = new Person("Сидоров");

        Map<Person, Address> personAddresses = new HashMap<>();
        personAddresses.put(person1, new Address("Москва", "Садовая", null));
        personAddresses.put(person2, new Address("Санкт-Петербург", "Вишневая", "123"));
        personAddresses.put(person3, new Address("Москва", "Абрикосовая", "55"));
        return personAddresses;
    }
}