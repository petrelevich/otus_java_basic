package treemap;

import java.util.Map;
import java.util.TreeMap;



public class TreeMapDemo2 {
    public static void main(String[] args) {
        // Попробуем в качестве ключа использовать treemap.Person
        Map<Person, Integer> mapPerson = new TreeMap<>();
        // Так будет работать?
        Person ivanov = new Person(10, "Иванов");
        Person petrov = new Person(3, "Петров");
        Person sidorov = new Person(7, "Сидоров");
//        mapPerson.put(ivanov, 100);
//        mapPerson.put(petrov, 50);
//        mapPerson.put(sidorov, 32);
        System.out.println(mapPerson);
        // см. ниже























        // Вариант 1 -- использовать конструктор TreeMap с компаратором
        Map<Person, Integer> mapPersonComparator = new TreeMap<>(
                (person1, person2) -> person1.getId().compareTo(person2.getId()));
        mapPersonComparator.put(ivanov, 100);
        mapPersonComparator.put(petrov, 50);
        mapPersonComparator.put(sidorov, 32);
        System.out.println(mapPersonComparator);

        // Вариант 2 -- реализовать Comparable
        Map<PersonC, Integer> mapPersonComparable = new TreeMap<>();
        PersonC ivanovC = new PersonC(10, "Иванов");
        PersonC petrovC = new PersonC(3, "Петров");
        PersonC sidorovC = new PersonC(7, "Сидоров");
        mapPersonComparable.put(petrovC, 50);
        mapPersonComparable.put(ivanovC, 100);
        mapPersonComparable.put(sidorovC, 32);
        System.out.println(mapPersonComparable);
    }
}

