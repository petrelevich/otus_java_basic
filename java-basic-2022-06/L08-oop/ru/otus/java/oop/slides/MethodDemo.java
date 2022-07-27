package ru.otus.java.oop.slides;

@SuppressWarnings("ALL")

    public class MethodDemo {

        public static void main(String[] args) {
            MethodDemo app = new MethodDemo();
            app.test(1.23);
            int result = app.test(20, 30);
            System.out.println(result);
        }



        int test(int a, int b) {
            System.out.println("Два параметра int: " + a + " " + b);
            return a + b;
        }

        void test(double a) {
            System.out.println("Один параметр double: " + a);
        }

    }
