//6*) Подсчитать количество треугольников, у которых стороны заданы целыми числами, и площадь которых не больше 100.

package com.slotvinskiy;

public class Task6 {

    public static final int MAX_AREA = 100;

    public static void main(String[] args) {

        double area = 0;
        int a;
        int b;
        int c;
        int counter = 0;
        int maxSideLength = getMaxSideLength(MAX_AREA);

        for (a = 1; a <= maxSideLength && area <= MAX_AREA; a++) {
            for (b = a; b <= maxSideLength && area <= MAX_AREA; b++) {
                for (c = b; c <= maxSideLength && area <= MAX_AREA; c++) {
                    if (a + b > c && c + b > a && a + c > b && area <= MAX_AREA) {
                        area = getArea(a, b, c);
                        if (area <= MAX_AREA) {
                            counter++;
                        }
                    }
                }
                if (area > MAX_AREA) {
                    area = 0;
                }
            }
        }
        System.out.println(counter);
    }

    private static int getMaxSideLength(int maxArea) {
        int a;
        int b;
        int c;
        for (a = 1, b = 1, c = 1; a + b > c; b++, c++) {
            if (getArea(a, b, c) >= maxArea) {
                break;
            }
        }
        if (b > c) {
            return b - 1;
        } else {
            return c - 1;
        }
    }

    private static double getArea(int a, int b, int c) {
        return Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (b + c - a)) / 4;
    }
}
