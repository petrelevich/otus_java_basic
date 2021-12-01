package ru.otus.demo04.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.demo04.app.service.*;

public class FactorialCalculatorTest02 {

    // Состояние на момент написания теста
    private final FactorialCalculatorV01 factorialCalculator = new FactorialCalculatorV01();

    // После починки теста
    //private final FactorialCalculatorV02 factorialCalculator = new FactorialCalculatorV02();

    public void testFactorialCalculationForPositiveN() {
        String scenario = "V2. Тест расчета факториала положительного числа";
        try {
            int expected = 6;
            int actual = factorialCalculator.factorial(3);
            Assertions.assertEquals(expected, actual);

            expected = 720;
            actual = factorialCalculator.factorial(6);
            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
