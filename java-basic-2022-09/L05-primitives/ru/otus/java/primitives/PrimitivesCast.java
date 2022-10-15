package ru.otus.java.primitives;

// Приведение типов (cast)
public class PrimitivesCast {
    public static void main(String[] args) {
        // Автоматическое приведение типов
        // Когда меньший к большему
        // Никакой потери точности нет
        System.out.println("-- автоматическое");
        byte myByte = 100; // от -128 до 127
        short myShort = myByte; // от -32 768 до 32 767
        System.out.println("Byte = " + myByte + " -> Short = " + myShort);

        int myInt = 20_000_000; // Разряды числа можно разделять через _
        long myLong = myInt;
        System.out.println("Int  = " + myInt + " -> Long value = " + myLong);

        // Явное приведение
        // Когда больший тип к меньшему
        // Может быть потеря данных
        System.out.println("-- явное с потерей данных");
        long myLongVal = 1_234_567_890_123_456L;
//        int myIntVal = myLongVal; // Простое присвоение - ошибка.
        // Явное приведение через скобки, может быть потеря данных:
        int myIntVal = (int) myLongVal;
        System.out.println("Long = " + myLongVal + " -> Int = " + myIntVal);

        System.out.println("-- явное без потери данных");
        long myLongVal2 = 10L;
        int myIntVal3 = (int) myLongVal2;
        System.out.println("Long = " + myLongVal2 + " -> Int = " + myIntVal3);

        // Вещественное в целое
        double myDoubleVal = 234.743;
        myIntVal = (int) myDoubleVal;
        System.out.println("Double  = " + myDoubleVal + " -> Int = " + myIntVal);

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
        float floatNum = 0.123456789f;
        System.out.println("floatNum = " + floatNum);

        // Чему равно doubleNum?
        double doubleNum = 0.1 + 0.2;
        System.out.printf("doubleNum = " + doubleNum);

//         Не компилируется. Как исправить?
//        long longValue = 12345678901;

//         Не компилируется. Как исправить?
//        float floatValue = 100.0;
    }
}
