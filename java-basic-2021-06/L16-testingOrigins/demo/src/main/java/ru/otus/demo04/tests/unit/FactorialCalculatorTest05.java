package ru.otus.demo04.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.demo04.app.service.*;

public class FactorialCalculatorTest05 {

    private final FactorialCalculatorV05 factorialCalculator = new FactorialCalculatorV05();

    public void testFactorialCalculationForPositiveNLessThan21() {
        String scenario = "V5. Тест расчета факториала положительного числа";
        try {
            long expected = 6;
            long actual = factorialCalculator.factorial(3);
            Assertions.assertEquals(expected, actual);

            expected = 720;
            actual = factorialCalculator.factorial(6);
            Assertions.assertEquals(expected, actual);

            expected = 2_432_902_008_176_640_000L;
            actual = factorialCalculator.factorial(20);
            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testFactorialCalculationForN0() {
        String scenario = "V5. Тест расчета факториала числа 0";
        try {
            long expected = 1;
            long actual = factorialCalculator.factorial(0);
            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testFactorialCalculationForNegativeN() {
        String scenario = "V5. Тест расчета факториала отрицательного числа";
        try {
            Throwable actual = null;
            try {
                factorialCalculator.factorial(-10);
            } catch (Throwable e) {
                actual = e;
            }

            if (actual == null) {
                throw new AssertionError("Given code does not throw any exception");
            } else {
                Assertions.assertEquals(IllegalArgumentException.class, actual.getClass());
            }
            /*
            Assertions.assertThrows(IllegalArgumentException.class,
                () -> factorialCalculator.factorial(-10));
             */

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testFactorialCalculationForBigN() {
        String scenario = "V5. Тест расчета факториала большого числа";
        try {
            Throwable actual = null;
            try {
                factorialCalculator.factorial(30);
            } catch (Throwable e) {
                actual = e;
            }

            if (actual == null) {
                throw new AssertionError("Given code does not throw any exception");
            } else {
                Assertions.assertEquals(IllegalArgumentException.class, actual.getClass());
            }

            /*
            Assertions.assertThrows(IllegalArgumentException.class,
                    () -> factorialCalculator.factorial(30));

             */

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
