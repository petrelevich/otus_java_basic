import java.awt.event.ActionListener;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalDemo {
    public static int process(int a, int b, BiFunction<Integer, Integer, Integer> func) {
        return func.apply(a, b);
    }

    public static void main(String[] args) {
        System.out.println("=== x + y");
        int result1 = process(1, 2, (x, y) -> x + y);
        System.out.println(result1);

        System.out.println("=== x * y");
        int result2 = process(2, 4, (x, y) -> x * y);
        System.out.println(result2);

        System.out.println("--- анонимный класс");
        // Эквивалентный анонимный класс
        System.out.println("=== x * y");
        int result3 = process(2, 4, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                return x * y;
            }
        });
        System.out.println(result3);

        // Эквивалентный анонимный класс, вынесенный отдельно
        System.out.println("=== x * y");
        BiFunction func = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                return x * y;
            }
        };
        int result4 = process(2, 4, func);
        System.out.println(result4);

        // Обычный класс
        System.out.println("--- обычный класс");
        System.out.println("=== x * y");
        BiFunction multiplication = new Multiplication();
        int resultMultiplication = process(2, 4, multiplication);
        System.out.println(resultMultiplication);

        System.out.println("=== Примеры лямбда-выражений");
        Runnable noArguments = () -> System.out.println("Hello World");
        Runnable multiStatement = () -> {
            System.out.print("Hello");
            System.out.println(" World");
        };

        noArguments.run();
        multiStatement.run();

        // ----------
        Function<Long, Long> f = new Function<Long, Long>(){

            @Override
            public Long apply(Long aLong) {
                return null;
            }
        };
    }
}

class Multiplication implements BiFunction<Integer, Integer, Integer> {
    @Override
    public Integer apply(Integer x, Integer y) {
        return x * y;
    }
}
