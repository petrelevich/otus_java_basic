package ru.otus.solution4_dip.domain;

public class Equation {
    private int leftSide;
    private int rightSide;
    private char sign;

    public Equation(int leftSide, int rightSide, char sign) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.sign = sign;
    }

    public int getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(int leftSide) {
        this.leftSide = leftSide;
    }

    public int getRightSide() {
        return rightSide;
    }

    public void setRightSide(int rightSide) {
        this.rightSide = rightSide;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return leftSide + " " + sign + " " + rightSide;
    }
}
