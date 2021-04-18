package primitives;

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

        int myInt = 20_000;
        long myLong = myInt;
        System.out.println("Int  = " + myInt + " -> Long value = " + myLong);

        // Явное приведение
        // Когда больший тип к меньшему
        // Может быть потеря данных
        System.out.println("-- явное");
        long myLongVal = 1_234_567_890_123_456L;
        //int myIntVal = myLongVal; // Простое присвоение - ошибка.
        int myIntVal = (int) myLongVal;
        System.out.println("Long = " + myLongVal + " -> Int = " + myIntVal);

        double myDoubleVal = 234.343;
        myIntVal = (int) myDoubleVal;
        System.out.println("Double  = " + myDoubleVal + " -> Int = " + myIntVal);

        // char можно преобразовывать в int
        char myChar = 'A';
        int charToInt = myChar;
        System.out.println("Character  = " + myChar + " -> Integer = " + charToInt);

        int myIntToConvert = 109;
        char myCharFromInt = (char) myIntToConvert;
        System.out.println("Integer value = " + myIntToConvert + " to Character value = " + myCharFromInt);
    }
}
