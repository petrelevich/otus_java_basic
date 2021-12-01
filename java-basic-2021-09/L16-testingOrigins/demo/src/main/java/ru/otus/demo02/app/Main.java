package ru.otus.demo02.app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите n или команду \"exit\"");
            String command = sc.nextLine();
            if (command.equals("exit")) {
                break;
            } else {
                int n = Integer.parseInt(command);
                int factorial = FactorialCalculator.factorial(n);
                System.out.printf("%d! = %d%n", n, factorial);
            }
        }
    }
}
