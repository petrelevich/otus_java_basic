package ru.otus.java;

class CodeBlockDemo {
    public static void main(String[] args) {
        int a = 20;

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            System.out.println("a = " + a);
            a = a - 2;
        }

        System.out.println(a);
//        System.out.println(i); // Будет ошибка, i недоступна
    }
}