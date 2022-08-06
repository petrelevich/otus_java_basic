package demo.generics.collections;

import java.util.Iterator;

public class PrintUtils {
    public static void print(Iterable<Integer> collection) {
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
