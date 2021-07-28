package ru.otus;


import java.util.Arrays;

public class Complexity {

    public static void main(String[] args) {
        int[] numbers = new int[]{3, 4, 6, 1, 8, 9};

        int idx3 = searchFirst(numbers, 3);
        int idx9 = searchFirst(numbers, 9);

        System.out.println("1 idx3:" + idx3);
        System.out.println("1 idx9:" + idx9);
        System.out.println("  ");


        idx3 = searchSecond(Arrays.copyOf(numbers, numbers.length), 3);
        idx9 = searchSecond(Arrays.copyOf(numbers, numbers.length), 9);

        System.out.println("1 idx3:" + idx3);
        System.out.println("1 idx9:" + idx9);

    }

    private static int searchFirst(int[] numbersArray, int number) {
        for (int idx = 0; idx < numbersArray.length; idx++) {
            if (number == numbersArray[idx]) {
                return idx;
            }
        }
        return -1;
    }

    private static int searchSecond(int[] numbersArray, int number) {
        Arrays.sort(numbersArray);
        return Arrays.binarySearch(numbersArray, number);
    }
}
