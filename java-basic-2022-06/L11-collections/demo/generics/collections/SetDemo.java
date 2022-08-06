package demo.generics.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static demo.generics.collections.PrintUtils.print;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = createSet();
        print(set);

        // Нет получения по индексу
//        var item1 = list.get(2);

        set.add(40);
        System.out.print("After add 40: ");
        print(set);

        // Попробуем добавить уже существующее значение в Set
        set.add(10);
        System.out.print("After add 10: ");
        print(set);
    }

    private static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        return set;
    }
}
