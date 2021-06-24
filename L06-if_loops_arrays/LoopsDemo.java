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

        // В for можно какие-то части опускать
        int k = 0;
        for (; k < 5; k++) {
            System.out.println(10 * k);
        }

        // Может быть, что код никогда не выполнится
        int a = 10;
        int b = 20;

        while (a > b) { // false
            System.out.println("Эта строка не выведется.");
        }

        // то же самое с do while
        do {
            System.out.println("А эта строка будет показана.");
        } while (a > b);

        // Вычисляем числа Фибоначчи
        // Каждое последующее число равно сумме двух предыдущих чисел
        System.out.println("=== Числа Фибонначи ===");
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;

        while (n3 < 100) {
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }

        // Обход массива
        System.out.println();
        System.out.println("=== Обход массива");
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < daysInMonths.length; i++) {
            System.out.println("Дней в месяце " + (i + 1) + " : " + daysInMonths[i]);
        }

        System.out.println("matrix:");
        int[][] matrix = {
                {0, 0, 0, 0, 0},
                {0, 1, 2, 3, 4},
                {0, 2, 4, 6, 8},
                {0, 3, 6, 9, 12},
                {0, 4, 8, 12, 16}
        };

        for(int i =0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int n = matrix[i][j];
                System.out.print(n + " ");
            }
            System.out.println();
        }
        // ----- for each
        System.out.println();
        System.out.println("=== for each");
        String[] answers = new String[]{"aaa", "bbb", "ccc", "ddd"};
        for (String item : answers) {
            System.out.println(item);
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
