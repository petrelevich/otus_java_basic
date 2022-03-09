package ru.otus.demo02.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.demo02.app.FactorialCalculator;

public class FactorialCalculatorTest {

    public void testFactorialCalculationWithPositiveN() {
        String scenario = "Тест расчета с положительным n";
        try {
            int actual = FactorialCalculator.factorial(2);
            Assertions.assertEquals(2, actual);

            actual = FactorialCalculator.factorial(3);
            Assertions.assertEquals(6, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
