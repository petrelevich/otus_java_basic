package ru.otus.solution3_srp.step03.domain;

public class EquationEvaluationResult {
    private final Equation equation;
    private final int result;

    public EquationEvaluationResult(Equation equation, int result) {
        this.equation = equation;
        this.result = result;
    }

    @Override
    public String toString() {
        return equation + " = " + result;
    }
}
