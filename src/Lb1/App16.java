package Lb1;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;
/*
Напишите программу, в которой пользователь вводит число, а программой
отображается последовательность из четырех чисел: число, на единицу
меньше введённого, введенное число и число, на единицу больше введенного.
Четвертое число должно быть квадратом суммы первых трех чисел.
 */
public class App16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int inputNum = scanner.nextInt();
        System.out.println(inputNum - 1);
        System.out.println(inputNum);
        System.out.println(inputNum + 1);
        inputNum = inputNum - 1 + inputNum + inputNum + 1;
        //тоже как в шарпе
        System.out.println(Math.pow(inputNum, 2));
    }
}