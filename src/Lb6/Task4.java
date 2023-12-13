package Lb6;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;
//Напишите программу, в которой описан статический метод для вычисления
//двойного факториала числа, переданного аргументом методу. По определению, двойной
//факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
//больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
//нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
public class Task4 {
    public static int calculateDoubleFactorial(int n) {
        if (n <= 0) {
            System.out.println("Число должно быть положительным");
        }

        int result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, положительное: ");
        int number = scanner.nextInt();
        int doubleFactorial = calculateDoubleFactorial(number);
        System.out.println(number + "!! = " + doubleFactorial);

        int anotherNumber = 5;
        int anotherDoubleFactorial = calculateDoubleFactorial(anotherNumber);
        System.out.println(anotherNumber + "!! = " + anotherDoubleFactorial);
    }
}
