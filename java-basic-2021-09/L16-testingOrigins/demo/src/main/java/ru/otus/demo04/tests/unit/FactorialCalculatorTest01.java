package ru.otus.demo04.tests.unit;

import ru.otus.assertions.Assertions;
import ru.otus.demo04.app.service.*;

public class FactorialCalculatorTest01 {
    // До того как мы начали писать тест ничего не было и тест не проходил)

    // После починки теста
    private final FactorialCalculatorV01 factorialCalculator = new FactorialCalculatorV01();

    public void testFactorialCalculationForN3() {
        String scenario = "V1. Тест расчета факториала числа 3";
        try {
            int expected = 6;
            int actual = factorialCalculator.factorial(3);
            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
