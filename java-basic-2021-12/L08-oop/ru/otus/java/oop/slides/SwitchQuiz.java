package ru.otus.java.oop.slides;

public class SwitchQuiz {
    public static void main(String[] args) {
        int num = 1;
        String result = "";

        switch (num) {
            case 1:
                result = "Один";
            case 2:
                result = "Два";
                break;
            case 3:
                result = "Три";
        }
        System.out.println(result);
    }
}
