package ru.otus.demo03.tests;

import ru.otus.assertions.TestExecutor;
import ru.otus.demo03.tests.unit.FactorialApplicationTest;
import ru.otus.demo03.tests.unit.FactorialCalculatorTest;
import ru.otus.demo03.tests.unit.IOStreamsServiceTest;

public class AllTests {
    public static void main(String[] args) {
        TestExecutor.doTest("Тест расчета с положительным n",
                () -> new FactorialCalculatorTest().testFactorialCalculationWithPositiveN());

        TestExecutor.doTest("Тест чтения строки", () -> new IOStreamsServiceTest().testInput());
        TestExecutor.doTest("Тест вывода строки", () -> new IOStreamsServiceTest().testOutput());
        TestExecutor.doTest("Тест форматированного вывода строки", () -> new IOStreamsServiceTest().testFormattedOutput());

        TestExecutor.doTest("Тест работы приложения", () -> new FactorialApplicationTest().testAppFlow());
    }
}
