package Lb6;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//Напишите программу со статическим методом, аргументом которому передается
//целочисленный массив, а результатом возвращается среднее значение для элементов
//массива (сумма значений элементов, деленная на количество элементов в массиве)
public class Task8 {
    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            System.out.println("Массив не должен быть пустым");
        }

        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        double average = calculateAverage(numbers);
        System.out.println("Среднее значение элементов массива: " + average);
    }
}
