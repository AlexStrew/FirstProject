package Lb2;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
/*
Напишите программу, которая проверяет, сколько тысяч во введенном
пользователем числе (определяется четвертая цифра справа в десятичном
представлении числа).
 */
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int thousandsDigit = (number / 1000) % 10;
        System.out.println("Тысячная цифра: " + thousandsDigit);
    }
}
