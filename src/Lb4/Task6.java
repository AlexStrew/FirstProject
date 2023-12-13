package Lb4;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//Напишите программу, в которой создается и инициализируется
//двумерный числовой массив. Затем из этого массива удаляется строка и
//столбец (создается новый массив, в котором по сравнению с исходным
//удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//удаляемого столбца определяется с помощью генератора случайных чисел.
public class Task6 {
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
                originalArray[i][j] = random.nextInt(777);
            }
        }

        System.out.println("Исходный массив:");
        printArray(originalArray);

        int rowIndexToRemove = random.nextInt(rows);
        int colIndexToRemove = random.nextInt(columns);

        int[][] newArray = new int[rows - 1][columns - 1];
        int newRow = 0;
        for (int i = 0; i < rows; i++) {
            if (i == rowIndexToRemove) {
                continue; // Скип строки для удаления
            }

            int newCol = 0;
            for (int j = 0; j < columns; j++) {
                if (j != colIndexToRemove) {
                    newArray[newRow][newCol] = originalArray[i][j];
                    newCol++;
                }
            }
            newRow++;
        }

        System.out.println("\nМассив без выбранной строки и столбца:");
        printArray(newArray);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}