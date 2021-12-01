package ru.otus.demo04.tests;

import ru.otus.demo04.tests.unit.*;

public class AllTests {
    public static void main(String[] args) {
        System.out.println("\n\n----------------------\n\n");

        new FactorialCalculatorTest01().testFactorialCalculationForN3();
        System.out.println("\n\n----------------------\n\n");

        new FactorialCalculatorTest02().testFactorialCalculationForPositiveN();
        System.out.println("\n\n----------------------\n\n");

        new FactorialCalculatorTest03().testFactorialCalculationForPositiveN();
        new FactorialCalculatorTest03().testFactorialCalculationForN0();
        System.out.println("\n\n----------------------\n\n");

        new FactorialCalculatorTest04().testFactorialCalculationForPositiveN();
        new FactorialCalculatorTest04().testFactorialCalculationForN0();
        new FactorialCalculatorTest04().testFactorialCalculationForNegativeN();
        System.out.println("\n\n----------------------\n\n");

        new FactorialCalculatorTest05().testFactorialCalculationForPositiveNLessThan21();
        new FactorialCalculatorTest05().testFactorialCalculationForN0();
        new FactorialCalculatorTest05().testFactorialCalculationForNegativeN();
        new FactorialCalculatorTest05().testFactorialCalculationForBigN();
    }
}
