package ru.otus.demo04.tests;

import ru.otus.assertions.TestExecutor;
import ru.otus.demo04.tests.unit.*;

public class AllTests {
    public static void main(String[] args) {
        System.out.println("\n\n----------------------\n\n");

        TestExecutor.doTest("V1. Тест расчета факториала числа 3", () -> new FactorialCalculatorTest01().testFactorialCalculationForN3());
        System.out.println("\n\n----------------------\n\n");

        TestExecutor.doTest("V2. Тест расчета факториала положительного числа", () -> new FactorialCalculatorTest02().testFactorialCalculationForPositiveN());
        System.out.println("\n\n----------------------\n\n");

        TestExecutor.doTest("V3. Тест расчета факториала положительного числа", () -> new FactorialCalculatorTest03().testFactorialCalculationForPositiveN());
        TestExecutor.doTest("V3. Тест расчета факториала числа 0", () -> new FactorialCalculatorTest03().testFactorialCalculationForN0());
        System.out.println("\n\n----------------------\n\n");

        TestExecutor.doTest("V4. Тест расчета факториала положительного числа", () -> new FactorialCalculatorTest04().testFactorialCalculationForPositiveN());
        TestExecutor.doTest("V4. Тест расчета факториала числа 0", () -> new FactorialCalculatorTest04().testFactorialCalculationForN0());
        TestExecutor.doTest("V4. Тест расчета факториала отрицательного числа", () -> new FactorialCalculatorTest04().testFactorialCalculationForNegativeN());
        System.out.println("\n\n----------------------\n\n");

        TestExecutor.doTest("V5. Тест расчета факториала положительного числа", () -> new FactorialCalculatorTest05().testFactorialCalculationForPositiveNLessThan21());
        TestExecutor.doTest("V5. Тест расчета факториала числа 0", () -> new FactorialCalculatorTest05().testFactorialCalculationForN0());
        TestExecutor.doTest("V5. Тест расчета факториала отрицательного числа", () -> new FactorialCalculatorTest05().testFactorialCalculationForNegativeN());
        TestExecutor.doTest("V5. Тест расчета факториала большого числа", () -> new FactorialCalculatorTest05().testFactorialCalculationForBigN());
    }
}
