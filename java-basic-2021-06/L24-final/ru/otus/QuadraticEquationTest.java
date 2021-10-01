package ru.otus;

import static ru.otus.QuadraticEquation.calcRoots;
import static ru.otus.QuadraticEquation.Roots;

public class QuadraticEquationTest {
    public static void main(String[] args)  {
        caseDifferentRoots();
        caseEqualRoots();
        caseNegativeDiscriminant();
    }

    public static void caseDifferentRoots()  {
        double a = 1;
        double b = 7;
        double c = 6;
        Roots roots = calcRoots(a, b, c);
        System.out.println(roots);

        double check1 = a * roots.getX1() * roots.getX1() + b * roots.getX1() + c;
        if (check1 != 0) {
            throw new AssertionError("wrong result");
        }

        double check2 = a * roots.getX2() * roots.getX2() + b * roots.getX2() + c;
        if (check2 != 0) {
            throw new AssertionError("wrong result");
        }
    }

    public static void caseEqualRoots() {
        double a = 1;
        double b = 2;
        double c = 1;

        Roots roots = calcRoots(a, b, c);
        System.out.println(roots);

        double check1 = a * roots.getX1() * roots.getX1() + b * roots.getX1() + c;
        if (check1 != 0) {
            throw new AssertionError("wrong result");
        }

        double check2 = a * roots.getX2() * roots.getX2() + b * roots.getX2() + c;
        if (check2 != 0) {
            throw new AssertionError("wrong result");
        }
    }

    public static void caseNegativeDiscriminant() {
        double a = 200;
        double b = 7;
        double c = 4;

        try {
            calcRoots(a, b, c);
            throw new AssertionError("wrong result");
        } catch (IllegalArgumentException ex) {
        }
    }
}
