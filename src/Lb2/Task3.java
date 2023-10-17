package Lb2;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
/*
Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: число делится на 4, и при
этом оно не меньше 10.
 */
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 4 == 0 && number >= 10) {
            System.out.println("Число удовлетворяет критериям.");
        } else {
            System.out.println("Число не удовлетворяет критериям.");
        }

    }
}
