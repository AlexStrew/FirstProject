package Lb1;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;

/*
Сделайте вариант вычисление ab с помощью встроенного метода (искать в
Math).
 */
public class App20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число ");
        int a = scanner.nextInt();
        System.out.println("Число " + a + " в квадрате будет.. " + Math.round(Math.pow(a,2)));

    }
}
