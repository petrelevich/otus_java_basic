import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Пишем калькулятор
        int a;
        int b;
        char operation;
        int result = 0;

        System.out.println("Введите два числа и операцию (+ или -) через пробел (например, 3 + 7):");

        // Пример как считать ввод пользователя
        // надо не забыть - import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        operation = sc.next().charAt(0);
        b = sc.nextInt();
        // Подробнее про Scanner - https://vertex-academy.com/tutorials/ru/rabota-so-skannerom-v-java/

        // Логика калькулятора
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            default:
                System.out.println("Неизвестная операция");
                break;
        }

        // Как переписать в if?

        System.out.println(a + " " + operation + " " + b + " = " + result);
    }
}









/*

Эквивалент switch:

if (operation == '+') {
    result = a + b;
} else if (operation == '-') {
    result = a - b;
} else {
    System.out.println("Неизвестная операция");
}


 */