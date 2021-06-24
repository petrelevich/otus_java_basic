package ru.otus.demo04.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.demo04.app.service.*;

public class FactorialCalculatorTest05 {

    private final FactorialCalculatorV05 factorialCalculator = new FactorialCalculatorV05();

    public void testFactorialCalculationForPositiveNLessThan21() {
        long expected = 6;
        long actual = factorialCalculator.factorial(3);
        Assertions.assertEquals(expected, actual);

        expected = 720;
        actual = factorialCalculator.factorial(6);
        Assertions.assertEquals(expected, actual);

        expected = 2_432_902_008_176_640_000L;
        actual = factorialCalculator.factorial(20);
        Assertions.assertEquals(expected, actual);
    }

    public void testFactorialCalculationForN0() {
        long expected = 1;
        long actual = factorialCalculator.factorial(0);
        Assertions.assertEquals(expected, actual);
    }

    public void testFactorialCalculationForNegativeN() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> factorialCalculator.factorial(- 10));
    }

    public void testFactorialCalculationForBigN() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> factorialCalculator.factorial(30));
    }
}
