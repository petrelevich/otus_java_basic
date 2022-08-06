package demo.generics.wrappers;

// Обертки примитивов
public class PrimitiveWrappers {
    public static void main(String[] args) {
        // Можем создать как и любые другие объекты
        Integer a = new Integer(123);
        Double b = new Double(12.34);
        Boolean c = new Boolean(false);

        // Автоупаковка (autoboxing) / автораспаковка (autounboxing)

        // Автоупаковка
        // primitive -> object (wrapper)
        Integer d = 10;
        int e = 20;
        d = e;

        // Автораспаковка
        // object (wrapper) -> primitive
        int f = d;

        // Вызов метода
        int sum = sum(12, 34);
        System.out.println(sum);

        // Производительность оберток и примитивов
        // Найти сумму чисел от 1 до N
        final long N = 100_000_000;

        // примитивы
        long startTimePrimitives = System.currentTimeMillis();
        long sumPrimitives = 0L;
        for (int i = 1; i < N; i++) {
            sumPrimitives += i;
        }
        long endTimePrimitives = System.currentTimeMillis();
        System.out.println("Sum primitives: " + (endTimePrimitives - startTimePrimitives) + " milliseconds");

        // обертки
        long startTimeWrappers = System.currentTimeMillis();
        Long sumWrappers = 0L;
        for (Integer i = 1; i < N; i++) {
            sumWrappers += i;
        }
        long endTimeWrappers = System.currentTimeMillis();
        System.out.println("Sum wrappers: " + (endTimeWrappers - startTimeWrappers) + " milliseconds");
    }

    private static Integer sum(Integer x, Integer y) {
        return x + y;
    }
}
