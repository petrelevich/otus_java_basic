package ru.otus.solution4_dip.services;

import ru.otus.solution4_dip.domain.Equation;
import ru.otus.solution4_dip.api.services.EquationParser;

public class EquationParserImpl implements EquationParser {

    @Override
    public Equation parseEquation(String equationString) {
        String[] arr = equationString.split(" ");
        try {
            if (arr.length != 3) {
                throw new IllegalArgumentException();
            }

            int leftSide = Integer.parseInt(arr[0]);
            int rightSide = Integer.parseInt(arr[2]);
            char sign = arr[1].charAt(0);

            if (sign != '+' && sign != '-' && sign != '*' && sign != '/') {
                throw new IllegalArgumentException();
            }

            return new Equation(leftSide, rightSide, sign);
        } catch (Exception ignored) {
        }
        return null;
    }
}
