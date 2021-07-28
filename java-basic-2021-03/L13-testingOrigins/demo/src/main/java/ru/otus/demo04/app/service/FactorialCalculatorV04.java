package ru.otus.demo04.app.service;

public class FactorialCalculatorV04 {

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n less then 0");
        }
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
