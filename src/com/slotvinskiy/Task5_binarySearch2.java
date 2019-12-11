//5*) Написать метод который ищет при помощи бинарного поиска есть ли число в массиве.
//Параметры - отсортированный массив и число которое надо проверить. Результат типа boolean.

package com.slotvinskiy;

import java.util.Arrays;
import java.util.Random;

public class Task5_binarySearch2 {

    private static final int SIZE = 10;
    private static final Random RANDOM = new Random();
    private static final int BOUND = 30;

    public static void main(String[] args) {

        int[] array = arrayInit(SIZE);
        System.out.print("Not sorted -");
        arrayPrint(array);
        insertSort(array);
        System.out.print("Sorted -    ");
        arrayPrint(array);
        int number = 7;
        boolean isNumber = findNumber(array, number);
        if (isNumber) {
            System.out.printf("There IS number %s in %s", number, Arrays.toString(array));
        } else {
            System.out.printf("There IS NOT number %s in %s", number, Arrays.toString(array));
        }

    }

    private static boolean findNumber(int[] array, int x) {

        int start = 0;
        int end = array.length - 1;
        if (array.length == 0) {
            System.out.println("There isn't any numbers in the array");
            return false;
        }
        if (array.length == 1 && array[0] == x) {
            return true;
        }

        while (start >= 0 && end <= array.length - 1) {
            int centerIndex = start + (end - start) / 2;
            int center = array[centerIndex];
            if (center == x || array[start] == x || array[end] == x) {
                return true;
            }
            if (end - start <= 1) {
                return false;
            }
            if (x < center && centerIndex > 0) {
                end = centerIndex - 1;
            } else if (x > center && centerIndex < array.length - 1) {
                start = centerIndex + 1;
            }
        }
        return false;
    }

    private static void insertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j >= 1 && array[j] < array[j - 1]; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
    }

    private static int[] arrayInit(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(BOUND);
        }
        return array;
    }

    private static void arrayPrint(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}

