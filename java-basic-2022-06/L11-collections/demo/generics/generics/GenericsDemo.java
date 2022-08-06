package demo.generics.generics;


public class GenericsDemo {
    public static void main(String[] args) {
        // Пишем класс для представления кортежа (tuple) из двух элементов

        // ---- Без дженериков
        TupleNoGenerics tuple1 = new TupleNoGenerics("abc", "def");
        TupleNoGenerics tuple2 = new TupleNoGenerics("abc", 100);

        // Не получится выполнить арифмет. операцию
//        var res1 = tuple2.getSecond() + 100;

        // нужно приведение
        var res2 = (int) tuple2.getSecond() + 100;

        // Можем установить значение любого типа
        tuple2.setSecond("zzz");

        // Можно выйти из положения так:
        TupleStringInteger tuple3 = new TupleStringInteger("abc", 100);
        var res3 = tuple3.getSecond() + 100;

        // ---- С дженериками
        Tuple<String, String> tuple4 = new Tuple<String, String>("abc", "def");
        Tuple<String, Integer> tuple5 = new Tuple<>("abc", 100);
        var res4 = tuple5.getSecond() + 100;

        // Проверка типов на этапе компиляции - здесь будет ошибка
//        tuple4.setSecond("zzz");

        // generic-методы
        var factory = new TupleFactory();
        Tuple<Long, Long> tuple6 = factory.<Long, Long>createTuple(10L, 20L);
        // Можно упростить (компилятор сам вычисляет типы):
        Tuple<Long, Long> tuple7 = factory.createTuple(10L, 20L);
        System.out.println(tuple7);
    }
}

