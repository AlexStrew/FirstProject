package Lb1;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.time.LocalDate;
import java.util.Scanner;
/*
Напишите программу, в которой по возрасту определяется год рождения.
 */
public class App14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int currentAge = scanner.nextInt();
        //LocalDate
        int currentYear = LocalDate.now().getYear();
        int year = calculateYear(currentAge, currentYear);
        System.out.println("Ваш год рождения: " + year);
    }
    public static int calculateYear(int currentAge, int currentYear) {
        return currentYear - currentAge;
    }
}
