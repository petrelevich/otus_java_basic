package ru.otus.demo02.app;

public class FactorialCalculator {

    public static int factorial(int n) {
        //return 3628800;
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = (i == 1)? i: res * i;
        }
        return res;
    }
}
