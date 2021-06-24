package primitives;

public class Operation {
    public static void main(String[] args) {
        // Арифметические
        int n1 = 5;
        int n2 = 2;
        int a = n1 + n2;
        int b = n1 - n2;
        int c = n1 / n2;
        int d = n1 * n2;
        int e = n1 % n2;

        System.out.println("c = " + c); // 5 / 2
        System.out.println("e = " + e); // 5 % 2

        // Инкремент, декремент
        System.out.println("-- Инкремент, декремент");
        int i = 10;
        System.out.println("i = " + i);
        i++; // Эквивалентно i = i + 1;
        System.out.println("i++ = " + i);
        i += 5; // Эквивалентно i = i + 5;
        System.out.println("i += 5 -> " + i++);

        int n = 1;
        System.out.println("n++ -> " + n++); // Так не писать

        int m = 1;
        System.out.println("++m -> " + ++m); // Так не писать

        // Битовые
        System.out.println("-- Сдвиг влево");
        int left = n2 << 1;
        System.out.println("0" + Integer.toBinaryString(n2) + " = " + n2);
        System.out.println(Integer.toBinaryString(left) + " = " + left);

        System.out.println("-- Сдвиг вправо");
        int right = n2 >> 1;
        System.out.println("0" + Integer.toBinaryString(n2) + " = " + n2);
        System.out.println("00" + Integer.toBinaryString(right) + " = " + right);

        // Битовые
        System.out.println("-- Не");
        int notN1 = ~n1;
        System.out.println("00000000000000000000000000000" +
                Integer.toBinaryString(n1) + " = " + n1);
        System.out.println(Integer.toBinaryString(notN1) + " = " + notN1);

        System.out.println("-- И");
        int and = n1 & n2;
        System.out.println(Integer.toBinaryString(n1) + " = " + n1);
        System.out.println("0" + Integer.toBinaryString(n2) + " = " + n2);
        System.out.println("00" + Integer.toBinaryString(and) + " = " + and);

        System.out.println("-- Или");
        int or = n1 | n2;
        System.out.println(Integer.toBinaryString(n1) + " = " + n1);
        System.out.println("0" + Integer.toBinaryString(n2) + " = " + n2);
        System.out.println(Integer.toBinaryString(or) + " = " + or);

        System.out.println("-- Исключающее или (XOR)");
        int n3 = 6;
        int xor = n1 ^ n3;
        System.out.println(Integer.toBinaryString(n1) + " = " + n1);
        System.out.println(Integer.toBinaryString(n3) + " = " + n3);
        System.out.println("0" + Integer.toBinaryString(xor) + " = " + xor);

        // Логические < > >= <= ! || &&
        System.out.println("-- Логические");
        boolean result = n1 > n2;
//        if (n1 > n2) {
//            return true;
//        } else {
//            return false;
//        }

        System.out.println("n1 > n2 = " + result);

        boolean resultNot = !result;
        System.out.println("!(n1 > n2) = " + resultNot);

        // Вещественные числа
        System.out.println("-- Вещественные числа");
        float floatNum = 0.123456789f;
        System.out.println("floatNum = " + floatNum);

        double doubleNum = 0.1 + 0.2;
        // Чему равна doubleNum?
        System.out.printf("doubleNum = " + doubleNum);

        // long
        // Не компилируется. Как исправить?
        //long longValue = 12345678901;

        // float
        // Не компилируется. Как исправить?
        //float floatValue = 100.0;

    }
}
