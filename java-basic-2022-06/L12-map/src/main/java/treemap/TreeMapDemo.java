package treemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, Person> map = new TreeMap<>();

        // put() - добавление элементов
        map.put(10, new Person(10, "Иванов"));
        map.put(5, new Person(5, "Снегирев"));
        map.put(3, new Person(3, "Петров"));
        map.put(7, new Person(7, "Сидоров"));
        map.put(6, new Person(6, "Попов"));

        System.out.println(map);

        // Дублей нет - вставим по существующему ключу
        map.put(3, new Person(3, "Петров Петр Петрович"));
        System.out.println(map);

        // get() - получить значение по ключу
        System.out.println("=== get() ===");
        Person person7 = map.get(7);
        Person person11 = map.get(11);
        System.out.println("person7 = " + person7);
        System.out.println("person11 = " + person11);

        // remove() - удалить элемент
        System.out.println("=== remove() ===");
        map.remove(6);
        System.out.println(map);

        // Сортировка в обратном направлении
        System.out.println("=== map.descendingMap() ===");
        System.out.println(map.descendingMap());

        // NavigableMap:
        // headMap() - от начала до указанного элемента
        // tailMap() - от указанного элемента до конца
        // subMap() - от указанного элемента до указанного элемента
        System.out.println("=== NavigableMap ===");
        System.out.println(map.firstEntry()); // первый элемент
        System.out.println(map.lastEntry()); // последний элемент
        System.out.println("headMap(5) = " + map.headMap(5));
        System.out.println("tailMap(6) = " + map.tailMap(6));
        System.out.println("subMap(5, 8) = " + map.subMap(5, 8));
    }
}
