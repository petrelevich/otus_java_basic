package demo.generics.collections;

import java.util.ArrayList;
import java.util.List;

import static demo.generics.collections.PrintUtils.print;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = createList();
        print(list);
        // Обратите внимание, что метод print мы не меняли,
        // а можем передавать туда разные типы коллекций.

        // В List по прежнему можем удалять, добавлять элементы
        // Появилась возможность получения элемента по индексу
        var item1 = list.get(2);
        System.out.println("get(2) = " +  item1);

        // Поиск элемента
        var item2 = list.indexOf(20);
        System.out.println("list.indexOf(20) = " + item2);

        // если элемент не найден, то результат -1
        var item3 = list.indexOf(50);
        System.out.println("list.indexOf(50) = " + item3);

        // ArrayList vs LinkedList
        // Про пользу интерфейсов - поменяем реализацию List

        // И еще про пользу дженериков - см. ListGenericsDemo
    }

    private static List<Integer> createList() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        return list;
    }
}
