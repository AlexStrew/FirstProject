package Lb6;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Arrays;
//Напишите программу со статическим методом, аргументом которому передается
//одномерный символьный массив. В результате вызова метода элементы массива попарно
//меняются местами: первый — с последним, второй — с предпоследним и так далее
public class Task9 {
    public static void swapPairs(char[] charArray) {
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] characters = {'a', 'b', 'c', 'd', 'e'};

        System.out.println("Исходный массив: " + Arrays.toString(characters));

        swapPairs(characters);

        System.out.println("Массив после обмена парами: " + Arrays.toString(characters));
    }
}
