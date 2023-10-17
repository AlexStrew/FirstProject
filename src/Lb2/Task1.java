package Lb2;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
/*
Напишите программу, которая проверяет, делится ли введенное
Пользователем число на 3.
 */
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println("Число делится на 3.");
        } else {
            System.out.println("Число не делится на 3.");
        }

    }
}
