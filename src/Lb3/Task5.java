package Lb3;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;

/*
Напишите программу, в которой вычисляется сумма чисел,
удовлетворяющих таким критериям: при делении числа на 5 в остатке получа-
ется 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
вводится пользователем. Программа отображает числа, которые
суммируются, и значение суммы. Предложите версии программы,
использующие разные операторы цикла.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        int sum = 0;
        System.out.print("Числа, удовлетворяющие условиям: ");
        for (int i = 1; n > 0; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                sum += i;
                System.out.print(i + " ");
                n--;
            }
        }

        System.out.println("\nСумма: " + sum);
    }
}