//4*) Заполнить массив случайными числами.
// Создать массив который в N раза больше исходного и N раз продублировать в нем исходный массив.
//Например: был массив [1,2,3] и N=2 => [1,2,3,1,2,3]

package com.slotvinskiy;

import java.util.Arrays;
import java.util.Random;

public class Task4 {

    private static final int SIZE = 4;
    private static final Random RANDOM = new Random();
    private static final int BOUND = 10;

    public static void main(String[] args) {

        int[] array = arrayInit(SIZE);
        arrayPrint(array);
        int N = 3;
        int[] newArray = new int[array.length * N];
        for (int i = 0; i < newArray.length; i += array.length) {
            System.arraycopy(array, 0, newArray, i, array.length);
        }
        arrayPrint(newArray);
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
