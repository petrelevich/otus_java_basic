package ru.otus.demo04.app.service;

import java.math.BigInteger;

public class FactorialCalculatorV05 {

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n less then 0");
        }

        if (n > 20) {
            throw new IllegalArgumentException("n more then 20");
        }

        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res.longValue();
    }
}
