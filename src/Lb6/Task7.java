package Lb6;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Arrays;

//Напишите программу со статическим методом, аргументом которому передастся
//символьный массив, а результатом возвращается ссылка на целочисленным массив,
//состоящий из кодов символов из массива- аргумента.
public class Task7 {
    public static int[] convertToAscii(char[] charArray) {
        int[] asciiArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            asciiArray[i] = (int) charArray[i];
        }

        return asciiArray;
    }

    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c'};
        int[] asciiArray = convertToAscii(charArray);

        System.out.println("Символьный массив: " + Arrays.toString(charArray));
        System.out.println("Целочисленный массив (коды символов): " + Arrays.toString(asciiArray));
    }
}
