package ru.otus.java.oop;

import java.util.function.BiFunction;

public class LambdaDemo {
    public static int process(
            int a,
            int b,
            BiFunction<Integer, Integer, Integer> func) {

        System.out.println("Start process()...");
        Integer result = func.apply(a, b);
        System.out.println("End process()");
        return result;
    }

    public static void main(String[] args) {
        System.out.println("=== x + y");
        // В метод process() хотим передать данные и "поведение",
        // которое что-то с этими данными сделает
        // (x, y) -> x + y - лямбда-выражение
        // передаем "сложение"
        int result1 = process(1, 2, (x, y) -> x + y);
        System.out.println(result1);

        // можем передать "умножение"
        System.out.println("=== x * y");
        int result2 = process(2, 4, (x, y) -> x * y);
        System.out.println(result2);

        // Лямбда-выражение в Java - это "синтаксический сахар"
        // над анонимными классами.
        // См. ниже класс Multiplication
        // Обычный класс Multiplication
        System.out.println("--- обычный класс");
        System.out.println("=== x * y");
        BiFunction multiplication = new Multiplication();
        int resultMultiplication = process(2, 4, multiplication);
        System.out.println(resultMultiplication);

        // Эквивалентный анонимный класс
        System.out.println("--- анонимный класс (отдельно)");
        BiFunction multiplication3 = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                return x * y;
            }
        };
        int result3 = process(2, 4, multiplication3);
        System.out.println(result3);

        // Анонимный класс, переданный сразу в метод
        System.out.println("--- анонимный класс (в методе)");
        int result4 = process(2, 4, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                return x * y;
            }
        });
        System.out.println(result4);

        // Эквивалетная лямбда (смотрим как IDEA помогает)
        // В интерфейсе должен быть один абстрактный метод
        System.out.println("--- лямбда");
        int result5 = process(2, 4, (x, y) -> x * y);
        System.out.println(result5);

        // Примеры лямбда-выражений
        System.out.println("=== Примеры лямбда-выражений");
        Runnable noArguments = () -> System.out.println("Hello World 1");
        Runnable multiStatement = () -> {
            System.out.print("Hello");
            System.out.println(" World 2");
        };

        noArguments.run();
        multiStatement.run();
    }
}

class Multiplication
        implements BiFunction<Integer, Integer, Integer> {
    @Override
    public Integer apply(Integer x, Integer y) {
        return x * y;
    }
}