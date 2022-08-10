package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Person, Integer> persons = new HashMap();
        fillMap(persons);
        System.out.println(persons);

        Person ivanov = new Person("Иванов");
        System.out.println("Ищем 'Иванов'");
        System.out.println(persons.containsKey(ivanov));

    }

    private static void fillMap(Map<Person, Integer> persons) {
        Person petrov = new Person("Петров");
        Person snegirev = new Person("Снегирев");
        Person popov = new Person("Попов");
        Person sidorov = new Person("Сидоров");
        Person ivanov = new Person("Иванов");

        persons.put(petrov, 44);
        persons.put(snegirev, 23);
        persons.put(popov, 22);
        persons.put(sidorov, 50);
        persons.put(ivanov, 34);
    }

}
