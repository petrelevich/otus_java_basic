package ru.otus.java.oop;

// Перегрузка методов
class Overload {
    void test() {
        System.out.println("Без параметров");
    }

    void test(int a) {
        System.out.println("Один параметр int: " + a);
    }

    void test(double a) {
        System.out.println("Один параметр double: " + a);
    }

    int test(int a, int b) {
        System.out.println("Два параметра int: " + a + " " + b);
        return a + b;
    }

    double test(double a, double b) {
        System.out.println("Два параметра double: " + a + " " + b);
        return a + b;
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Overload obj = new Overload();

        obj.test();
        System.out.println();

        obj.test(2);
        System.out.println();

        obj.test(2.0);
        System.out.println();

        int result1 = obj.test(2, 3);
        System.out.println("obj.test(2, 3) = " + result1);
        System.out.println();

        double result2 = obj.test(0.5, 5.2);
        System.out.println("obj.test(0.5, 5.2) = " + result2);
        System.out.println();

//        Какой метод будет вызван здесь?
        int result3 = (int) obj.test(1, 5.6);
        System.out.println("(int) obj.test(1, 5.6) = " + result3);
        System.out.println();

        obj.test(2L);
        System.out.println("obj.test(2L)");
        System.out.println();

//         Посмотрим для примера методы System.out.println
//        System.out.println();

//        Без перегрузки было бы:
//        System.out.printlnFloat(...);
//        System.out.printlnInt(...);
//        System.out.printlnString(...);
//        System.out.printlnCharArray(...);
//        и т.д.

        // И методы в классе Math
//        Math.abs()
    }
}
