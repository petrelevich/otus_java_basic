package ru.otus.java.primitives;

public class Operation {
    public static void main(String[] args) {
        // Арифметические
        int n1 = 5;
        int n2 = 2;
        int a = n1 + n2; // Сложение
        int b = n1 - n2; // Вычитание
        float c = n1 / n2; // Деление
        int d = n1 * n2; // Умножение
        int e = n1 % n2; // Остаток от деления

        // Внимательно при делении целых чисел
        System.out.println("c = " + c); // 5 / 2 (еще здесь есть конкатенация строк и обрезается дробь)
        // А если изменить тип c на float?

        System.out.println("e = " + e); // 5 % 2

        // Инкремент, декремент
        System.out.println("-- Инкремент, декремент");
        int i = 10;
        System.out.println("i = " + i);
        i++; // Эквивалентно i = i + 1;
        System.out.println("i++ = " + i);
        i += 5; // Эквивалентно i = i + 5;
        System.out.println("i += 5 -> " + i++);

        int n = 1;
        System.out.println("n++ -> " + n++); // Так лучше не писать - лучше n++ в отдельной строке

        int m = 1;
        System.out.println("++m -> " + ++m); // Так лучше не писать - лучше ++m в отдельной строке

        System.out.println("n = " + n);
        System.out.println("m = " + m);

        // Логические
        // < > >= <= !
        // || - или
        // && - и
        System.out.println("-- Логические");
//        if (n1 > n2) {
//            return true;
//        } else {
//            return false;
//        }

        boolean result = n1 > n2;
        System.out.println("result = " + result);

        boolean resultNot = !result;
        System.out.println("!result = " + resultNot);
        //if (n1 != n2)
    }
}
