package ru.otus.solution4_dip.services;

import ru.otus.solution4_dip.domain.Equation;
import ru.otus.solution4_dip.domain.EquationEvaluationResult;
import ru.otus.solution4_dip.api.services.EquationEvaluator;

public class EquationEvaluatorImpl implements EquationEvaluator {

    @Override
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
