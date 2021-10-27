package ru.otus.java.oop;

class ClassA {
    static int count;
    static {
        count = 10;
    }

    public void increaseCount(){
        count++;
    }

    public static int getCount(){
        return count;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println(ClassA.getCount());

        ClassA obj1 = new ClassA();
        obj1.increaseCount();
        System.out.println(ClassA.count);

        ClassA obj2 = new ClassA();
        obj2.increaseCount();
        System.out.println(ClassA.getCount());
    }

}