package ru.otus.demo03.tests;

import ru.otus.demo03.tests.unit.FactorialApplicationTest;
import ru.otus.demo03.tests.unit.FactorialCalculatorTest;
import ru.otus.demo03.tests.unit.IOStreamsServiceTest;

public class AllTests {
    public static void main(String[] args) {
        new FactorialCalculatorTest().testFactorialCalculationWithPositiveN();

        new IOStreamsServiceTest().testInput();
        new IOStreamsServiceTest().testOutput();
        new IOStreamsServiceTest().testFormattedOutput();

        new FactorialApplicationTest().testAppFlow();
    }
}
