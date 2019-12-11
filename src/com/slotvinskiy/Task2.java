//2) Заполнить массив случайными числами. Подсчитать:
//- количество элементов которые больше своего соседа слева
//- количество четных элементов (ноль считается чётным числом)
//- количество элементов которые меньше среднего арифметического

package com.slotvinskiy;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    private static final int SIZE = 10;
    private static final Random RANDOM = new Random();
    private static final int BOUND = 20;

    public static void main(String[] args) {

        int[] array = arrayIntInit();
        System.out.println(Arrays.toString(array));
        int evenCount = 0;
        int biggerLeftCount = 0;
        int biggerAverageCount = 0;
        double average = findAverage(array);

        for (int i = 0; i < array.length; i++) {
            if (i != 0 && array[i] > array[i - 1]) {
                biggerLeftCount++;
            }
            if (array[i] % 2 == 0) {
                evenCount++;
            }
            if (array[i] > average) {
                biggerAverageCount++;
            }
        }
        System.out.printf("There are %s elements bigger than their neighbor on the left in the array\n", biggerLeftCount);
        System.out.printf("There are %s even elements in the array\n", evenCount);
        System.out.printf("There are %s elements bigger than average (%s) in the array\n", biggerAverageCount, average);
    }

    private static double findAverage(int[] array) {
        double average = 0;
        for (int value : array) {
            average += value;
        }
        return average / array.length;
    }

    private static int[] arrayIntInit() {
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = RANDOM.nextInt(BOUND);
        }
        return array;
    }
}
