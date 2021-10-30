interface GuardSystem {
    void guard();

    Address getGuardSystemAddress();
}

class Address {
    private String city;
    private String street;

    public String getFullAddress() {
        return String.format("City: %s, Street: %s", city, street);
    }
}

abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void speak(); // <--- !!! abstract
}

class Cat extends Animal {
    private int miceCaughtCount;

    @Override
    public void speak() {
        System.out.println("Мяу... мяу...");
    }

    public void sleep() { /* NOP */ }
}

class Dog extends Animal implements GuardSystem {
    private Address address;

    @Override
    public void speak() {
        System.out.println("Гав, гав!");
    }

    @Override
    public void guard() { /* NOP */}

    @Override
    public Address getGuardSystemAddress() {
        return address;
    }

    public void run() { /* NOP */}
}

class ElectronicGuardSystem implements GuardSystem {
    private Address address;
    private String manufacturer;
    private String model;

    @Override
    public void guard() { /* NOP */}

    @Override
    public Address getGuardSystemAddress() {
        return address;
    }
}

class HomeService {
    public static Home buildHouse(
            Address address,
            GuardSystem guardSystem,
            Animal animal) {

        return new Home(address, guardSystem, animal);
    }
}

class Home {
    private Address address;
    private GuardSystem guardSystem;
    private Animal animal;

    public Home(Address address, GuardSystem guardSystem, Animal animal) {

        this.address = address;
        this.guardSystem = guardSystem;
        this.animal = animal;
    }

    public Address getAddress() {
        return address;
    }

    public GuardSystem getGuardSystem() {
        return guardSystem;
    }

    public Animal getAnimal() {
        return animal;
    }
}