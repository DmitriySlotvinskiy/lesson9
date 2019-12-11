package com.slotvinskiy.Task1;

public class UtilSorts {

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    public static void selectSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minElement = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minElement]) {
                    minElement = j;
                }
            }
            swap(array, i, minElement);
        }
    }

    public static void insertSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j >= 1 && array[j] < array[j - 1]; j--) {
                swap(array, j, j - 1);
            }
        }
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}