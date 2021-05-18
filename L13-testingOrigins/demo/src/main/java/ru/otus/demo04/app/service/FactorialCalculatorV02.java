package ru.otus.demo04.app.service;

public class FactorialCalculatorV02 {

    public int factorial(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = (i == 1)? i: res * i;
        }
        return res;
    }
}
