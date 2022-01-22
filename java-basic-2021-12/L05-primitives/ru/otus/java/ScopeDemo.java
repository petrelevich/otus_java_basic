package ru.otus.java;
// String name = "Java" - переменные вне класса объявлять нельзя

class ScopeDemo {
    public static final int MAX_VALUE = 99; // <1>
    public int count; // <2>

    public static void main(String[] args){
        int num = 100; // <3>
        System.out.println("Значение num: " + num);
    }

    public void sayHello(String name){ // <4>
            System.out.println("Привет, " + name);
    }
}