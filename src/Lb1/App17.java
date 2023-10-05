package Lb1;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;
/*
Напишите программу, в которой Пользователь вводит два числа, а
программой вычисляется и отображается сумма и разность этих чисел.
 */
public class App17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int fNum = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int sNum = scanner.nextInt();
        int dif,sum;
        sum = fNum + sNum;
        dif = fNum - sNum;
        System.out.println("Сумма чисел = " + sum + " Разность чисел = " + dif);
    }
}
