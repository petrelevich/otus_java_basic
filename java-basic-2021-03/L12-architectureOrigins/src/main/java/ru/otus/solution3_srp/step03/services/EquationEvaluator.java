package ru.otus.solution3_srp.step03.services;

import ru.otus.solution3_srp.step03.domain.Equation;
import ru.otus.solution3_srp.step03.domain.EquationEvaluationResult;

public class EquationEvaluator {
    public EquationEvaluationResult evaluateEquation(Equation equation) {
        int equationResult = 0;
        switch (equation.getSign()) {
            case '+' -> equationResult = (equation.getLeftSide() + equation.getRightSide());
            case '-' -> equationResult = (equation.getLeftSide() - equation.getRightSide());
            case '*' -> equationResult = (equation.getLeftSide() * equation.getRightSide());
            case '/' -> equationResult = (equation.getLeftSide() / equation.getRightSide());
        }
        return new EquationEvaluationResult(equation, equationResult);
    }
}
