package Lb2;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
/*
Напишите программу, которая проверяет, попадает ли введение
пользователем число в диапазон от 5 до 10 включительно.
 */
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number >= 5 && number <= 10) {
            System.out.println("Число находится в диапазоне от 5 до 10 включительно.");
        } else {
            System.out.println("Число не находится в указанном диапазоне.");
        }

    }
}
