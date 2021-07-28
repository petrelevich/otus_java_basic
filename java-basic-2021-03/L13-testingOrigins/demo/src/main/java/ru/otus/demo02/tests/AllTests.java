package ru.otus.demo02.tests;

import ru.otus.assertions.TestExecutor;
import ru.otus.demo02.tests.unit.FactorialCalculatorTest;

public class AllTests {
    public static void main(String[] args) {
        TestExecutor.doTest("Тест расчета с положительным n",
                () -> new FactorialCalculatorTest().testFactorialCalculationWithPositiveN());
    }
}
