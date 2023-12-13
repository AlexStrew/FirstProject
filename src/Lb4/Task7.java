package Lb4;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;
//Напишите программу, в которой создается двумерный числовой массив
//и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
//затем последний столбец (снизу вверх), вторая строка (слева направо) и так
//далее.
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строки: ");
        int rows = scanner.nextInt();
        System.out.print("Введите столбцы: ");
        int columns = scanner.nextInt();
        int[][] snakeArray = new int[rows][columns];
        int counter = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columns; j++) {
                    snakeArray[i][j] = counter++;
                }
            } else {
                for (int j = columns - 1; j >= 0; j--) {
                    snakeArray[i][j] = counter++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(snakeArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
