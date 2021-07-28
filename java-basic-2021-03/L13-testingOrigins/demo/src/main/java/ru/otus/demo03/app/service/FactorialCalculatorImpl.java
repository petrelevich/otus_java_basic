package ru.otus.demo03.app.service;

public class FactorialCalculatorImpl implements FactorialCalculator {

    public int factorial(int n) {
        //return 3628800;
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = (i == 1)? i: res * i;
        }
        return res;
    }
}
