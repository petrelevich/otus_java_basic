package ru.otus.demo03.tests.unit.fakes;

import ru.otus.demo03.app.service.FactorialCalculator;

import java.util.List;

public class FactorialCalculatorSpy implements FactorialCalculator {

    private final List<String> actualFlow;

    public FactorialCalculatorSpy(List<String> actualFlow) {
        this.actualFlow = actualFlow;
    }

    @Override
    public int factorial(int n) {
        actualFlow.add(String.format("factorial calculations was called with n = %d", n));
        return 2021;
    }
}
