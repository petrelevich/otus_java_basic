package ru.otus.solution4_dip.api.services;

import ru.otus.solution4_dip.domain.Equation;

public interface EquationParser {
    Equation parseEquation(String equationString);
}
