package ru.otus;


import java.util.Arrays;

public class Complexity {

    public static void main(String[] args) {
        int[] numbers = new int[]{3, 4, 6, 1, 8, 9};

        boolean idx3 = isExistsFirst(numbers, 3);
        boolean idx19 = isExistsFirst(numbers, 19);

        System.out.println("1 idx3:" + idx3);
        System.out.println("1 idx9:" + idx19);
        System.out.println("  ");

        idx3 = isExistsSecond(Arrays.copyOf(numbers, numbers.length), 3);
        idx19 = isExistsSecond(Arrays.copyOf(numbers, numbers.length), 19);

        System.out.println("1 idx3:" + idx3);
        System.out.println("1 idx9:" + idx19);

    }

    // O(n)
    private static boolean isExistsFirst(int[] numbersArray, int number) {
        for (int i : numbersArray) {
            if (number == i) {
                return true;
            }
        }
        return false;
    }

    private static boolean isExistsSecond(int[] numbersArray, int number) {
        Arrays.sort(numbersArray);
        return Arrays.binarySearch(numbersArray, number) >= 0;
    }
}
