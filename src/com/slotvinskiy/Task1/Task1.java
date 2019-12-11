//1) Создать enum который отображает вид сортировки, например enum SortType { BUBBLE, INSERT, SELECT }.
// Написать метод который принимает массив и переменную типа enum и
// сортирует выбранным типом сортировки, например: sort(arr, SortType.INSERT);

package com.slotvinskiy.Task1;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    private static final int SIZE = 10;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        int[] array = arrayInit(SIZE);
        arrayPrint(array);
        SortMethod method = SortMethod.SELECT;
        sortArray(array, method);
        arrayPrint(array);
    }

    private static void sortArray(int[] array, SortMethod method) {
        if (method == SortMethod.INSERT) {
            System.out.println("You chose insert sort method");
            UtilSorts.insertSort(array);
        } else if (method == SortMethod.BUBBLE) {
            System.out.println("You chose bubble sort method");
            UtilSorts.bubbleSort(array);
        } else if (method == SortMethod.SELECT) {
            System.out.println("You chose select sort method");
            UtilSorts.selectSort(array);
        } else {
            System.out.println("Array haven't been sorted.");
        }
    }

    private static int[] arrayInit(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(100);
        }
        return array;
    }

    private static void arrayPrint(int[] array) {
        System.out.println(Arrays.toString(array));
    }


}
