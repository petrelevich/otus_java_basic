package ru.otus;

public class QuadraticEquation {

    public static Roots calcRoots(double a, double b, double c)  {
        //ax^{2}+bx+c=0

        if (a == 0) {
            throw new IllegalArgumentException("a can't be equal 0");
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            throw new IllegalArgumentException("Discriminant can't be less then 0, discriminant:" + discriminant);
        }

        double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        return new Roots(x1, x2);
    }

    public static class Roots {
        private final double x1;
        private final double x2;

        public Roots(double x1, double x2) {
            this.x1 = x1;
            this.x2 = x2;
        }

        public double getX1() {
            return x1;
        }

        public double getX2() {
            return x2;
        }

        @Override
        public String toString() {
            return "Roots{" +
                    "x1=" + x1 +
                    ", x2=" + x2 +
                    '}';
        }
    }
}
