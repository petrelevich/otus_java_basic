package ru.otus.java.example04;

import java.util.LinkedList;
import java.util.Scanner;

class Person {
    public String name; // На public не обращать внимания

    public Person(String name) {
        this.name = name;
    }
}

public class Example04 {
    public static void main(String[] args) {
        LinkedList<Person> personsUniqueList = new LinkedList();

        fillList(personsUniqueList);

        print(personsUniqueList);
    }

    private static void fillList(LinkedList<Person> personsUniqueList) {
        Person person1 = new Person("person1");
        personsUniqueList.add(person1);
        Person person2 = new Person("person2");
        personsUniqueList.add(person1);
        Person person3 = new Person("person3");
        personsUniqueList.add(person3);
    }

    private static void print(LinkedList<Person> persons) {
        for(Person person : persons){
            System.out.println(person.name);
        }
    }
}