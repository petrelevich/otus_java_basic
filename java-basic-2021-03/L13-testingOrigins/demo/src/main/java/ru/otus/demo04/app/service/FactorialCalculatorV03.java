package ru.otus.demo04.app.service;

public class FactorialCalculatorV03 {

    public int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
