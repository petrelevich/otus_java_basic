package ru.otus.java.oop;

class Counter {
    String name; // Поле принадлежит объекту
    static int count; // Поле принадлежит классу
    final static int MAX = 10;

    static {
        count = 10;
    }

    public void increaseCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        int n = Counter.MAX;

        System.out.println("1 Counter.count = " + Counter.count);
        System.out.println("2 Counter.getCount() = " + Counter.getCount());

        Counter obj1 = new Counter();
        obj1.increaseCount();
        System.out.println("3 Counter.count = " + Counter.count);

        Counter obj2 = new Counter();
        obj2.name = "obj2";
        obj2.increaseCount();
        System.out.println("4 Counter.getCount() = " + Counter.getCount());

        Counter obj3 = new Counter();
        obj2.name = "obj2";
        obj3.increaseCount();
        System.out.println("5 Counter.getCount() = " + Counter.getCount());
    }

}