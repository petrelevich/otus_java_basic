package ru.otus;

import java.util.BitSet;

public class NumbersDemo {

    public static void main(String[] args) {
       // binaryFormat();
       // octalHexFormat();

       //bitwiseOperations();

       // bitOperations();
       // bitSet();


        // compressExample();
        // ifSimplification();
    }

    static void binaryFormat() {
        long b = 0b0010; //0b - признак бинарной системы счисления
        System.out.println("in decimal:" + b);
        System.out.println("asBinString:" + Long.toBinaryString(b));

        int minusOne = -2;
        System.out.println("minusOneAsBinString:" + Integer.toBinaryString(minusOne));
    }

    static void octalHexFormat() {
        int x = 8;
        System.out.println("x in octal format:" + Integer.toOctalString(x));
        int xOct = 010; //лидирующий 0 - признак 8и-ричной системы счисления
        System.out.println("xOct:" + xOct);

        int radix16 = 16;
        System.out.println("radix16 in hex format:" + Integer.toHexString(radix16));

        int xHex = 0xFF;
        System.out.println("xHex:" + xHex);
    }

    private static void bitwiseOperations() {
        // логическое И
        long x1 = 0b0010;
        long x2 = 0b0011;
        System.out.println("x1:" + Long.toBinaryString(x1));
        System.out.println("x2:" + Long.toBinaryString(x2));

        long resultAnd = x1 & x2;
        System.out.println("resultAnd:" + Long.toBinaryString(resultAnd));

        // логическое ИЛИ
        long resultOr = x1 | x2;
        System.out.println("resultOr:" + Long.toBinaryString(resultOr));

        // логическое НЕ
        long resultNot1 = ~x1;
        long resultNot2 = ~x2;
        System.out.println("resultNot1:" + Long.toBinaryString(resultNot1));
        System.out.println("resultNot2:" + Long.toBinaryString(resultNot2));

        //сдвиг влево
        long resultShiftLeft = x1 << 1;
        System.out.println("resultShiftLeft:" + Long.toBinaryString(resultShiftLeft) + " dec:" + resultShiftLeft);

        //сдвиг вправо
        long resultShiftRight = x1 >> 1;
        System.out.println("resultShiftRight:" + Long.toBinaryString(resultShiftRight) + " dec:" + resultShiftRight);

        //отрицательные числа
        long negVal = -1;
        System.out.println("negVal                :" + Long.toBinaryString(negVal));

        System.out.println("negVal shiftLeft      :" + Long.toBinaryString(negVal << 10));
        System.out.println("negVal shiftRight     :" + Long.toBinaryString(negVal >> 10));

        //беззнакоый сдвиг
        System.out.println("negVal shiftRight unSign:        " + Long.toBinaryString(negVal >>> 10));
    }


    static void bitOperations() {
        byte sh = Byte.parseByte("00001000", 2);
        System.out.println("sh:" + Integer.toBinaryString(sh));

        //установим 0-й бит
        int shSet0Bit = sh | 0b1;
        System.out.println("shSet0Bit:" + Integer.toBinaryString(shSet0Bit));

        //сбросим 3-й бит
        int bitMask = 0b1000; // так называемая "битовая маска"
        int bitMaskNegative = ~bitMask; // инвертируем биты
        System.out.println("bitMaskNegative:" + Integer.toBinaryString(bitMaskNegative));
        int shReset3Bit = shSet0Bit & bitMaskNegative;
        System.out.println("shReset3Bit:" + Integer.toBinaryString(shReset3Bit));
    }

    static void bitSet() {
        BitSet bitSet = new BitSet();
        System.out.println("bitSet:" + bitSet);

        bitSet.set(0, true);        // установим значение бита 0
        System.out.println("set 0 to True:" + bitSet);

        boolean value = bitSet.get(0);  // текущее значение бита 0
        System.out.println("0-bit:" + value);

        bitSet.flip(0, 9); //инвертируем сразу диапазон бин
        System.out.println(bitSet);
        System.out.println("0-bit:" + bitSet.get(0));
        System.out.println("5-bit:" + bitSet.get(5));
        System.out.println("6-bit:" + bitSet.get(6));

        bitSet.set(0, 6, false); // сбросим значения диапазона бит
        System.out.println(bitSet);
        System.out.println("0-bit:" + bitSet.get(0));
        System.out.println("5-bit:" + bitSet.get(5));
        System.out.println("6-bit:" + bitSet.get(6));
    }

    private static void compressExample() {
        boolean fromSensor0 = true;
        boolean fromSensor1 = false;
        boolean fromSensor2 = true;
        boolean fromSensor3 = true;

        long transportData = 0;
        transportData = setBit(transportData, 0, fromSensor0);
        System.out.println("transportData:" + Long.toBinaryString(transportData));

        transportData = setBit(transportData, 1, fromSensor1);
        System.out.println("transportData:" + Long.toBinaryString(transportData));

        transportData = setBit(transportData, 2, fromSensor2);
        System.out.println("transportData:" + Long.toBinaryString(transportData));

        transportData = setBit(transportData, 3, fromSensor3);
        System.out.println("transportData:" + Long.toBinaryString(transportData));

        System.out.println("get result");
        System.out.println("0-bit:" + getBit(transportData, 0));
        System.out.println("1-bit:" + getBit(transportData, 1));
        System.out.println("2-bit:" + getBit(transportData, 2));
        System.out.println("3-bit:" + getBit(transportData, 3));
    }

    private static long setBit(long data, int bitIdx, boolean value) {
        long bitMask = 1L << bitIdx;
        System.out.printf("set %d-bit on data:%s, value:%b, using bitMask:%d %n", bitIdx, Long.toBinaryString(data), value, bitMask);
        return value ? data | bitMask : data & ~bitMask;
    }

    private static boolean getBit(long data, int bitIdx) {
        long bitMask = 1L << bitIdx;
        System.out.printf("get %d-bit on data:%s, using bitMask:%d %n", bitIdx, Long.toBinaryString(data), bitMask);
        return (data & bitMask) > 0;
    }

    static void ifSimplification() {

        if (ifCondition(true, true)) {
            System.out.println("if true");
        }

        System.out.println(ifCondition(false, false) + " " + ifConditionDeMorgan(false, false));
        System.out.println(ifCondition(false, true) + " " + ifConditionDeMorgan(false, true));
        System.out.println(ifCondition(true, false) + " " + ifConditionDeMorgan(true, false));
        System.out.println(ifCondition(true, true) + " " + ifConditionDeMorgan(true, true));
    }

    private static boolean ifCondition(boolean a, boolean b) {
        return !(!a || !b);
    }

    private static boolean ifConditionDeMorgan(boolean a, boolean b) {
        return a && b;
    }
}
