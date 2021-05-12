package ru.otus.solution4_dip.api.services;

import ru.otus.solution4_dip.domain.Equation;
import ru.otus.solution4_dip.domain.EquationEvaluationResult;

public interface EquationEvaluator {
    EquationEvaluationResult evaluateEquation(Equation equation);
}
