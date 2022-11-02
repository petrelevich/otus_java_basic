package ru.otus.java.oop.inheritance;

// extends Object - всегда неявно, писать не надо
class Person extends Object {
    private String name;

    public Person(String name) {
        this.name = name;
    }

//region toString

//    @Override
//    public String toString() {
//        return this.name;
//    }

//endregion

//region equals, hashCode

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Person person = (Person) o;
//
//        return name != null
//                ? name.equals(person.name)
//                : person.name == null;
//    }
//
//    @Override
//    public int hashCode() {
//        return name != null ? name.hashCode() : 0;
//    }

//endregion
}

public class ObjectDemo {
    public static void main(String[] args) {
        Person ivanov1 = new Person("Иванов");

        // Неявно вызывается toString()
        System.out.println(ivanov1);
        // Эквивалентно следующему:
        System.out.println(ivanov1.toString());
        // Можем переопределить метод в наследнике

        Person ivanov2 = new Person("Иванов");
        // == сравнение по равенству ссылок
        System.out.println("ivanov1 == ivanov -> " + (ivanov1 == ivanov2));
        // В Object есть метод equals
        System.out.println("ivanov1 == ivanov -> " + (ivanov1.equals(ivanov2)));
        // Ссылочные типы, в том числе строки (String) сравнивайте через equals()
    }
}
