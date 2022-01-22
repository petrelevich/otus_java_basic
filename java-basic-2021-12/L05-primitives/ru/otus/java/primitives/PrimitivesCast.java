package ru.otus.java.primitives;

// Приведение типов (cast)
public class PrimitivesCast {
    public static void main(String[] args) {
        // Автоматическое приведение типов
        // Когда меньший к большему
        // Никакой потери точности нет
        System.out.println("-- автоматическое");
        byte myByte = 100;
        short myShort = myByte;
        System.out.println("Byte = " + myByte + " -> Short = " + myShort);

        int myInt = 20_000_000; // Можно разделять через _
        long myLong = myInt;
        System.out.println("Int  = " + myInt + " -> Long value = " + myLong);

        // Явное приведение
        // Когда больший тип к меньшему
        // Может быть потеря данных
        System.out.println("-- явное с потерей данных");
        // Обратите внимание на L в записи числа
        long myLongVal = 1_234_567_890_123_456L;
        //int myIntVal = myLongVal; // Простое присвоение - ошибка.
        int myIntVal = (int) myLongVal;
        System.out.println("Long = " + myLongVal + " -> Int = " + myIntVal);
        // оператор + конкатенация строк

        // Вещественное в целое
        double myDoubleVal = 234.743;
        myIntVal = (int) myDoubleVal;
        System.out.println("Double  = " + myDoubleVal + " -> Int = " + myIntVal);

        System.out.println("-- явное без потери данных");
        long myLongVal2 = 10;
        int myIntVal3 = (int) myLongVal2;
        System.out.println("Long = " + myLongVal2 + " -> Int = " + myIntVal3);

        System.out.println("-- char -> int");
        // char можно преобразовывать в int
        char myChar = 'A';
        int charToInt = myChar;
        System.out.println("Character = " + myChar + " -> Integer = " + charToInt);

        int myIntToConvert = 109;
        char myCharFromInt = (char) myIntToConvert;
        System.out.println("Integer = " + myIntToConvert + " -> Character = " + myCharFromInt);

        // Особенности вещественных чисел
        System.out.println("-- Вещественные числа");
        float floatNum = 0.123456789F;
        // Обратите внимание на F в записи числа
        System.out.println("floatNum = " + floatNum);

        double doubleNum = 0.1 + 0.2;

        // Чему равно doubleNum?
        System.out.printf("doubleNum = " + doubleNum);

//         long
//         Не компилируется. Как исправить?
//        long longValue = 12345678901;

//         float
//         Не компилируется. Как исправить?
//        float floatValue = 100.0;
    }
}
