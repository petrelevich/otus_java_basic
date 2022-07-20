package ru.otus.java.demo;

public class LoopsDemo {

    public static void main(String[] args) {
        // while
        System.out.println("=== while (i < 5) ===");
        int count = 0;
        while (count < 5) {
            System.out.println(count);
            count++;
        }

        // То же самое с for
        System.out.println("===  for(int i = 0; i < 5; i++) ===");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // int i = 0 - инициализация цикла
        // i < 5     - условие завершения цикла
        // i++       - изменение счетчика

        // В for можно какие-то части опускать
        System.out.println("===  for (; k < 5; k++) ===");
        int k = 0;
        for (; k < 5; k++) {
            System.out.println(10 * k);
        }
        // Переменная k будет доступна вне цикла (редко, но иногда такое бывает нужно)
        System.out.println("k = " + k);

        // Бесконечный цикл
//        for(;;){
//            System.out.println("Я в бесконечном цикле");
//        }

        // Как написать бесконечный цикл с while?

        System.out.println("=== while (a > b) и do ... while (a > b)===");
        // Может быть, что тело цикла никогда не выполнится
        int a = 10;
        int b = 20;

        while (a > b) { // false
            System.out.println("Эта строка не выводится.");
        }

        // то же самое с do while
        do {
            System.out.println("А эта строка будет показана.");
        } while (a > b);

        // Пример использования while, когда не знаем количество итераций.
        // Вычисляем числа Фибоначчи:
        // каждое последующее число равно сумме двух предыдущих чисел.
        System.out.println("=== Числа Фибонначи ===");
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;

        // Найдем числа Фибонначи меньше 100
        while (n3 < 100) {
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }

        // continue
        System.out.println("=== continue");
        // Отображаем нечетные числа
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;

            System.out.println(i);
        }

        // break
        // Бесконечный цикл, если значение больше 50, то выходим из цикла
        System.out.println("=== break");
        int i = 0;
        while (true) {
            i++;
            if (i > 50)
                break;
            //...
        }
        System.out.println("i = " + i);
    }
}
