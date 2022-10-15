package ru.otus.java;

class CodeBlockDemo {
    private static int id = 5;
    private static final int MAX_VALUE = 10;

    public static void main(String[] args) {
        int a = 20;

        for (int i = 0; i < MAX_VALUE; i++) {
            System.out.println("i = " + i);
            System.out.println("a = " + a);
            a = a - 2;
            int b = 10;
        }

        System.out.println(a);
        System.out.println(id);
//        System.out.println(b); // ОШИБКА - b вне области видимости
//        System.out.println(i); // ОШИБКА - i вне области видимости
    }
}