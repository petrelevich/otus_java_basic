import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // Map - ассоциативный массив, словарь, "ключ - значение"
        Map<Integer, String> names = createMap();

        // put() - добавление элементов
        names.put(1, "Иванов");
        names.put(2, "Петров");
        names.put(3, "Сидоров");
        System.out.println(names);

        names.put(2, "Петров Петр");
        System.out.println(names);

        // get() - получить значение по ключу
        String name2 = names.get(2);
        System.out.println("names.get(2) = " + name2);

        // containsKey() - проверить наличие ключа
        System.out.println("=== containsKey() ===");
        System.out.println(names.containsKey(2));
        System.out.println(names.containsKey(4));

        // containsValue() - проверить наличие ключа
        System.out.println("=== containsValue() ===");
        System.out.println(names.containsValue("Петров Петр"));
        System.out.println(names.containsValue("Снегирев"));

        // Получить все ключи
        System.out.println("=== keySet() ===");
        for (Integer key : names.keySet()) {
            System.out.println(key);
        }

        // Получить все значения
        System.out.println("=== values() ===");
        for (String value : names.values()) {
            System.out.println(value);
        }

        // Получить пары "ключ-значение"
        System.out.println("=== entrySet() ===");
        for (Map.Entry<Integer, String> item : names.entrySet()) {
            System.out.println(item.getKey() + " -> " + item.getValue());
        }

        // Ключи могут быть и другие
        Map<String, String> addresses = new HashMap<>();
        addresses.put("Иванов", "Москва");
        addresses.put("Петров", "Санкт-Петербург");

        String ivanovAddress = addresses.get("Иванов");
        System.out.printf("addresses.get(\"Иванов\") = " + ivanovAddress);
    }

    private static Map createMap() {
        return new HashMap();
    }

}
