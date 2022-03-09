package ru.otus.demo02.tests;

import ru.otus.demo02.tests.unit.FactorialCalculatorTest;

public class AllTests {
    public static void main(String[] args) {
        new FactorialCalculatorTest().testFactorialCalculationWithPositiveN();
    }
}
