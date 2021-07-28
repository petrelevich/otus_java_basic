package ru.otus.demo04.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.demo04.app.service.*;

public class FactorialCalculatorTest01 {
    private final FactorialCalculatorV01 factorialCalculator = new FactorialCalculatorV01();

    public void testFactorialCalculationForN3() {
        int expected = 6;
        int actual = factorialCalculator.factorial(3);
        Assertions.assertEquals(expected, actual);
    }
}
