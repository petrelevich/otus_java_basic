package ru.otus.java.oop.slides;

public class StringDemo {
    public static void main(String[] args) {
        String address = new String("Москва, Кремль");
        int len = address.length();
        boolean empty = address.isEmpty();
        char ch = address.charAt(9);
        String[] items = address.split(",");
    }
}
