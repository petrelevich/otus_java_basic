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

// Интерфейс "Охраняющий"
interface Guarding {
    void guard(); // охранять
    // могут быть другие методы
}

class Dog extends Animal implements Guarding {
    public Dog(String name) {
        setName(name);

        // Можно написать более явно:
        // super.setName(name);
        // super - ссылка на базовый класс
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

class ElectronicGuardSystem implements Guarding {
    private String manufacturer;
    private String model;

    @Override
    public void guard() {
        System.out.println("Включение ElectronicGuardSystem...");
    }
}

public class OopInheritancePolyDemo {
    public static void main(String[] args) {
//        Нельзя создать экземпляр абстрактного класса
//        Animal someAnimal = new Animal();
//        и интерфейса - будут ошибки
//        Guarding guarding = new Guarding();

        // Использование метода getName базового класса
        System.out.println("=== Dog");
        Dog dog = new Dog("Бобик");
        System.out.println(dog.getName());
        // getName() в классе Dog не определен
        // он определен в родительском классе Animal
        // Еще обратим внимание на конструктор и как задается поле name
        dog.guard();

        System.out.println("=== Cat");
        Cat cat = new Cat();
        System.out.println(cat.getName());
        cat.setName("Барсик");  // setName() тоже у родителя
        System.out.println(cat.getName());

        // Полиморфизм - пример 1
        System.out.println("=== Полиморфизм 1");
        Animal animal1 = new Dog("Полиморфная собака");
        // Строка выше эквивалентна (автоматическое преобразование):
        Animal animal1_1 = (Animal) new Dog("Полиморфная собака");
        // У animal1 доступны только методы Animal
        // методы Dog не доступны
        // animal1.guard(); //ошибка
        Animal animal2 = new Cat();
        animal2.setName("Полиморфный кот");

        // Вызываем метод speak() у родительского класса Animal,
        // но вызывается метод у потомка
        System.out.println(animal1.getName() + ":");
        animal1.speak();
        System.out.println(animal2.getName() + ":");
        animal2.speak();
        // Здесь мы видим "Позднее связывание" -
        // какой метод будет вызываться
        // решается при выполнении, а не при компиляции
        // То же самое было для метода toString() класса Object

        // Полиморфизм - пример 2
        // передадим Animal в метод talkWithAnimal
        System.out.println("=== Полиморфизм 2");
        talkWithAnimal(animal1);
        talkWithAnimal(animal2);

        // Можно и dog и cat (Dog dog, Cat cat)
        talkWithAnimal(dog);
        talkWithAnimal(cat);
        // Автоматическое преобразование типов
        // Dog -> Animal
        // Cat -> Animal
        // Вызов выше эквивалентен:
        talkWithAnimal((Animal)dog);
        talkWithAnimal((Animal)cat);
        // Это восходящее преобразование (upcasting)
        // Подкласс -> Базовый класс или Интерфейс
        // Можно работать прозрачно с подклассом как с базовым классом
        // Метод talkWithAnimal() получился универсальным -
        // может работать с разными типами
        // Можно создать классы других животных,
        // логика talkWithAnimal() не изменяется.

        // Полиморфизм - пример 3
        System.out.println("=== Полиморфизм 3 (интерфейс)");
        startGuard(dog);
        startGuard(new ElectronicGuardSystem());

        // Так будет работать?
//        startGuard(cat);

//        Guarding dog2 = new Dog("Шарик");
//        startGuard(dog2);

//        Dog dog3 = new Dog("Бобик");
//        startGuard(dog3);

//        Cat cat2 = new Cat();
//        startGuard((Guarding)cat2);
//
//        Dog dog4 = new Dog("noname");
//        startGuard((Guarding)dog4);

        // Нисходящее преобразование (downcasting)
        // от базового класса к наследникам
        Animal animal = AnimalFactory.createAnimal();
        // Что из этого сработает?
//        Dog dog5 = animal;
//        Dog dog6 = (Dog)animal;
//        Cat cat7 = animal;
//        Cat cat8 = (Cat)animal;

//        if (animal instanceof Dog){
//            Dog dog7 = (Dog)animal;
//        }
    }

    private static void talkWithAnimal(Animal animal) {
        System.out.println("=== метод talkWithAnimal()");
        System.out.println("Привет!");
        animal.speak();
    }

    // Можно сделать talkWithAnimal без полиморфизма
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
        System.out.println("Включение охранной системы");
        guard.guard();
    }
}