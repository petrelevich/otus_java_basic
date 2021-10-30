package ru.otus.java.oop;

abstract class Animal {
    private String name;

    public abstract void speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Охраняющий
interface Guarding {
    void guard(); // охранять
    // могут быть другие методы
}

class Dog extends Animal implements Guarding {
    public Dog(String name) {
        setName(name);
    }

    @Override
    public void speak() {
        System.out.println("Гав-гав!");
    }

    @Override
    public void guard() {
        System.out.println("Охраняю...");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Мяу-мяу...");
    }
}

public class OopInheritancePolyDemo {
    public static void main(String[] args) {
//        Нельзя создать экземпляр абстрактного класса
//        Animal someAnimal = new Animal();
//        и интерфейса - будут ошибки
//        Guarding guarding = new Guarding();

        System.out.println("=== Dog");
        Dog dog = new Dog("Бобик");
        System.out.println(dog.getName()); // getName() у родителя
        dog.guard();

        System.out.println("=== Cat");
        Cat cat = new Cat();
        System.out.println(cat.getName());
        cat.setName("Барсик");  // setName() тоже у родителя
        System.out.println(cat.getName());

        // Полиморфизм - пример 1
        System.out.println("=== Полиморфизм 1");
        Animal animal1 = new Dog("Полиморфная собака");
        // У animal1 доступны только методы Animal
        // методы Dog не доступны
        // animal1.guard();
        Animal animal2 = new Cat();
        animal2.setName("Полиморфный кот");

        // Позднее связывание - какой метод будет вызываться
        // решается при выполнении, а не при компиляции
        System.out.println(animal1.getName() + ":");
        animal1.speak();
        System.out.println(animal2.getName() + ":");
        animal2.speak();

        // Полиморфизм - пример 2 (передадим Animal в метод)
        System.out.println("=== Полиморфизм 2");
        talkWithAnimal(animal1);
        talkWithAnimal(animal2);

        // Можно и dog с cat (Dog dog, Cat cat)
        talkWithAnimal(dog);
        talkWithAnimal(cat);

        // Полиморфизм - пример 3
        System.out.println("=== Полиморфизм 3 (интерфейс)");
        startGuard(dog);

        // Так будет работать?
//        startGuard(cat);

//        Guarding dog2 = new Dog("Шарик");
//        startGuard(dog2);

//        Dog dog3 = new Dog("Бобик");
//        startGuard(dog2);

//        Cat cat2 = new Cat();
//        startGuard((Guarding)cat2);

//        Dog dog4 = new Dog("noname");
//        startGuard((Guarding)dog4);
    }

    private static void talkWithAnimal(Animal animal) {
        System.out.println("=== метод talkWithAnimal()");
        System.out.println("Привет!");
        animal.speak();
    }

    // Без полиморфизма можно сделать
    // с помощью перегрузки методов.
    // Чем плохо?
    private static void talkWithAnimalOverloaded(Dog dog) {
        dog.speak();
    }

    private static void talkWithAnimalOverloaded(Cat cat) {
        cat.speak();
    }

    // начать охранять
    private static void startGuard(Guarding guard) {
        guard.guard();
    }
}