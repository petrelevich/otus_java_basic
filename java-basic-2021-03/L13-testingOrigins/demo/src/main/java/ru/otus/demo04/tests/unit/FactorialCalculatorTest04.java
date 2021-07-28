package ru.otus.demo04.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.demo04.app.service.*;

public class FactorialCalculatorTest04 {

    private final FactorialCalculatorV04 factorialCalculator = new FactorialCalculatorV04();

    public void testFactorialCalculationForPositiveN() {
        int expected = 6;
        int actual = factorialCalculator.factorial(3);
        Assertions.assertEquals(expected, actual);

        expected = 720;
        actual = factorialCalculator.factorial(6);
        Assertions.assertEquals(expected, actual);
    }

    public void testFactorialCalculationForN0() {
        int expected = 1;
        int actual = factorialCalculator.factorial(0);
        Assertions.assertEquals(expected, actual);
    }

    public void testFactorialCalculationForNegativeN() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> factorialCalculator.factorial(- 10));
    }

}
