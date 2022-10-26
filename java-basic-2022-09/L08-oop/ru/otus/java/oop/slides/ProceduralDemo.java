package ru.otus.java.oop.slides;

public class ProceduralDemo {
    public static void main(String[] args) {
        String message = buildMessage("OTUS");
        System.out.println(message);
    }

    private static String buildMessage(String name) {
        String message = "Привет, " + name;
        return message;
    }
}
