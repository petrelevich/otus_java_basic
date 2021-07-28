package ru.otus.solution3_srp.step03.services;

import ru.otus.solution3_srp.step03.domain.EquationEvaluationResult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EquationEvaluationResultHistoryHolder {
    private final List<EquationEvaluationResult> historyList;

    public EquationEvaluationResultHistoryHolder() {
        historyList = new ArrayList<>();
    }

    public void addEquationEvaluationResult(EquationEvaluationResult result) {
        historyList.add(result);
    }

    public List<EquationEvaluationResult> getHistoryList() {
        return Collections.unmodifiableList(historyList);
    }
}
