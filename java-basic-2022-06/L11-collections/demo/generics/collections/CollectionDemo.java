package demo.generics.collections;

import java.util.*;

import static demo.generics.collections.PrintUtils.print;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Integer> collection = createCollection();
        PrintUtils.print(collection);

        // Так будет ошибка?
        // Iterable<Integer> collection2 = createCollection();

        // В Collection появились методы size, add, remove, contains
        System.out.println("size = " + collection.size());

        collection.add(5);
        print(collection);
        // посмотрим еще на import static

        collection.remove(30);
        print(collection);

        System.out.println("contains(20) = " + collection.contains(20));
        System.out.println("contains(15) = " + collection.contains(15));

        var otherCollection = createCollection();
        collection.addAll(otherCollection);
        print(collection);
    }

    private static Collection<Integer> createCollection() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        return list;
    }
}
