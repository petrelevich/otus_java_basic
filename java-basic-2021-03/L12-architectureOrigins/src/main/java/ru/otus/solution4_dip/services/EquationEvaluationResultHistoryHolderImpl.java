package ru.otus.solution4_dip.services;

import ru.otus.solution4_dip.domain.EquationEvaluationResult;
import ru.otus.solution4_dip.api.services.EquationEvaluationResultHistoryHolder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EquationEvaluationResultHistoryHolderImpl implements EquationEvaluationResultHistoryHolder {
    private final List<EquationEvaluationResult> historyList;

    public EquationEvaluationResultHistoryHolderImpl() {
        historyList = new ArrayList<>();
    }

    @Override
    public void addEquationEvaluationResult(EquationEvaluationResult result) {
        historyList.add(result);
    }

    @Override
    public List<EquationEvaluationResult> getHistoryList() {
        return Collections.unmodifiableList(historyList);
    }
}
