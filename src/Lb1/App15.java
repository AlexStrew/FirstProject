package Lb1;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;
/*
Напишите программу для вычисления суммы двух чисел. Оба числа
вводятся пользователем. Для вычисления суммы используйте оператор +.
 */
public class App15 {
    public static void main(String[] args) {
        int foo, bar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        foo = scanner.nextInt();
        System.out.print("Введите первое число: ");
        bar = scanner.nextInt();
        System.out.println(foo + bar);
    }
}
