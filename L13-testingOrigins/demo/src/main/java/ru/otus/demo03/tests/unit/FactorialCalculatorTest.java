package ru.otus.demo03.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.demo03.app.service.FactorialCalculatorImpl;

public class FactorialCalculatorTest {

    private FactorialCalculatorImpl factorialCalculator = new FactorialCalculatorImpl();

    public void testFactorialCalculationWithPositiveN() {
        int actual = factorialCalculator.factorial(2);
        Assertions.assertEquals(2, actual);

        actual = factorialCalculator.factorial(3);
        Assertions.assertEquals(6, actual);
    }
}
