package ru.otus.demo04.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.demo04.app.service.*;

public class FactorialCalculatorTest02 {

    private final FactorialCalculatorV02 factorialCalculator = new FactorialCalculatorV02();

    public void testFactorialCalculationForPositiveN() {
        int expected = 6;
        int actual = factorialCalculator.factorial(3);
        Assertions.assertEquals(expected, actual);

        expected = 720;
        actual = factorialCalculator.factorial(6);
        Assertions.assertEquals(expected, actual);
    }
}
