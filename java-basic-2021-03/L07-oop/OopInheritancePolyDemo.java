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
    public void guard(); // охранять
}

class Dog extends Animal implements Guarding {
    public Dog(String name) {
        setName(name);
    }

    @Override
    public void speak() {
        System.out.println("Гав-гав!");
    }

    public void guard(){
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
        // Нельзя моздать экземпляр абстрактного класса
        //Animal someAnimal = new Animal();

        System.out.println("=== Dog");
        Dog dog = new Dog("Бобик");
        System.out.println(dog.getName());
        dog.guard();

        System.out.println("=== Cat");
        Cat cat = new Cat();
        System.out.println(cat.getName());
        cat.setName("Барсик");
        System.out.println(cat.getName());

        // Полиморфизм - пример 1
        System.out.println("=== Полиморфизм 1");
        Animal animal1 = new Dog("Полиморфная собака");
        Animal animal2 = new Cat();
        animal2.setName("Полиморфный кот");

        animal1.speak();
        animal2.speak();

        // Полиморфизм - пример 2
        System.out.println("=== Полиморфизм 2");
        talkWithAnimal(animal1);
        talkWithAnimal(animal2);

        // Полиморфизм - пример 3
        System.out.println("=== Полиморфизм 3 (интерфейс)");
        checkGuard(dog);

        // Так будет работать?
//        checkGuard(cat);
    }

    private static void talkWithAnimal(Animal animal) {
        System.out.println("=== talkWithAnimal");
        System.out.println("Привет!");
        animal.speak();
    }

    // Вариант с перегрузкой методов.
    // Чем плохо?
//    private static void talkWithAnimal(Dog dog) { }
//    private static void talkWithAnimal(Cat cat) { }


    private static void checkGuard(Guarding guard) {
        guard.guard();
    }
}