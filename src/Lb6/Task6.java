package Lb6;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Arrays;

//Напишите программу со статическим методом, которому аргументом передается
//целочисленный массив и целое число. Результатом метод возвращает ссылку на новый
//массив, который получается из исходного массива (переданного первым аргументом
//методу), если в нем взять несколько начальных элементов. Количество элементов, которые
//нужно взять из исходного массива, определяются вторым аргументом метода. Если второй
//аргумент метода больше длины массива, переданного первым аргументом, то методом
//создается копия исходного массива и возвращается ссылка на эту копию.
public class Task6 {
    public static int[] modifyArray(int[] originalArray, int elementsToTake) {
        if (elementsToTake <= 0) {
            System.out.println("Количество элементов должно быть положительным");
        }

        if (elementsToTake > originalArray.length) {
            return Arrays.copyOf(originalArray, originalArray.length);
        } else {
            return Arrays.copyOf(originalArray, elementsToTake);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementsToTake = 3;

        int[] modifiedArray = modifyArray(array, elementsToTake);

        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Количество элементов для взятия: " + elementsToTake);
        System.out.println("Модифицированный массив: " + Arrays.toString(modifiedArray));
    }
}
