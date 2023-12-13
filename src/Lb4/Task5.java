package Lb4;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Напишите программу, в которой создается двумерный целочисленный
//массив. Он заполняется случайными числами. Затем в этом массиве строи и
//столбцы меняются местами: первая строка становится первым столбцом,
//вторая строка становиться вторым столбцом и так далее. Например, если
//исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
//из 5 строк и 3 столбцов
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строки: ");
        int rows = scanner.nextInt();
        System.out.print("Введите столбцы: ");
        int columns = scanner.nextInt();

        int[][] originalArray = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                originalArray[i][j] = random.nextInt(999);
            }
        }

        System.out.println("Исходный массив:");
        printArray(originalArray);

        int[][] swappedArray = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                swappedArray[i][j] = originalArray[j][i];
            }
        }

        System.out.println("Массив со строками и столбцами, поменянными местами:");
        printArray(swappedArray);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}