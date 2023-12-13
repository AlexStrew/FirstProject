package Lb6;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//Напишите программу с классом, в котором есть статические методы, которым
//можно передавать произвольное количество целочисленных аргументов (или
//целочисленный массив). Методы, на основании переданных аргументов или массива,
//позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее
//значение из набора чисел.
public class Task3 {
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("Нет чисел для поиска максимального значения");
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("Нет чисел для поиска минимального значения");
        }

        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double findAverage(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("Нет чисел для вычисления среднего значения");
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] values = {10, 5, 7, 8, 20};

        System.out.println("Максимальное значение: " + findMax(values));
        System.out.println("Минимальное значение: " + findMin(values));
        System.out.println("Среднее значение: " + findAverage(values));
    }
}
