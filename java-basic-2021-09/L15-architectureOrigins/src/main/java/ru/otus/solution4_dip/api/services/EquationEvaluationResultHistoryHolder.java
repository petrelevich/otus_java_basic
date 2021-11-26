package ru.otus.solution4_dip.api.services;

import ru.otus.solution4_dip.domain.EquationEvaluationResult;

import java.util.List;

public interface EquationEvaluationResultHistoryHolder {
    void addEquationEvaluationResult(EquationEvaluationResult result);
    List<EquationEvaluationResult> getHistoryList();
}
