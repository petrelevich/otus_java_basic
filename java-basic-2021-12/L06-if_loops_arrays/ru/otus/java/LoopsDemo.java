package ru.otus.java;

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
            System.out.println("Эта строка не выведется.");
        }

        // то же самое с do while
        do {
            System.out.println("А эта строка будет показана.");
        } while (a > b);

        // Пример использования while, кодга не знаем количество итераций
        // Вычисляем числа Фибоначчи
        // Каждое последующее число равно сумме двух предыдущих чисел
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

        // Обход массива
        System.out.println();
        System.out.println("=== Обход массива for");
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < daysInMonths.length; i++) {
            System.out.println("Дней в месяце " + (i + 1) + " : " + daysInMonths[i]);
        }

        // foreach - если индекс нам не важен
        System.out.println();
        System.out.println("=== Обход массива foreach");
        for (int dayCount : daysInMonths) {
            System.out.println("Дней в месяце ??? : " + dayCount);
        }

        // ----- for each
        System.out.println();
        System.out.println("=== for each");
        String[] answers = new String[]{"aaa", "bbb", "ccc", "ddd"};
        for (String item : answers) {
            System.out.println(item);
        }

        System.out.println("== Обход двумерного массива ===");
        int[][] matrix = {
                {0, 0, 0, 0, 0},
                {0, 1, 2, 3, 4},
                {0, 2, 4, 6, 8},
                {0, 3, 6, 9, 12},
                {0, 4, 8, 12, 16}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int n = matrix[i][j];
                System.out.print(n + " ");
            }
            System.out.println();
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
