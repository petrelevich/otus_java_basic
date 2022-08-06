package demo.generics.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableDemo {
    public static void main(String[] args) {
        Iterable<Integer> items = createItarable();
        Iterator<Integer> iterator = items.iterator();

        System.out.println("--- while hasNext()");
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            System.out.println(item);
        }

        // Но лучше так:
        System.out.println("--- for each");
        for (Integer item : items) {
            System.out.println(item);
        }

        // Эквивалентный for с итератором
        System.out.println("--- for with iterator");
        List<Integer> list = createList();
        for (Iterator<Integer> i = list.iterator(); i.hasNext(); ) {
            Integer item = i.next();
            System.out.println(item);
        }
    }

    private static Iterable<Integer> createItarable() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        return list;
    }

    private static List<Integer> createList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        return list;
    }
}
