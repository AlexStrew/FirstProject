package Lb6;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;

//Напишите программу со статическим методом, которым вычисляется сумма
//квадратов натуральных чисел 12 + 22 + 32 + ... + п2. Число п передается аргументом методу.
//Для проверки результата можно использовать формулу 12 + 22 +32+…+n2 = (n+l) (2 n + 1)/6
public class Task5 {
    public static int calculateSumOfSquares(int n) {
        if (n <= 0) {
            System.out.println("Число должно быть натуральным");
        }

        return (n * (n + 1) * (2 * n + 1)) / 6; //проверка
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, положительное: ");
        int number = scanner.nextInt();
        int sumOfSquares = calculateSumOfSquares(number);
        System.out.println("Сумма квадратов натуральных чисел до " + number + " равна " + sumOfSquares);
    }
}
