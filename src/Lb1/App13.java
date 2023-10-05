package Lb1;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.time.LocalDate;
import java.util.Scanner;
/*
Напишите программу, в которой Пользователь вводит имя и год рождения,
в программа отображает сообщение содержащее имя пользователя и его
возраст.
 */
public class App13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите год вашего рождения: ");
        int birthYear = scanner.nextInt();
        //LocalDate
        int currentYear = LocalDate.now().getYear();
        int age = calculateAge(birthYear, currentYear);
        System.out.println(name+ "!" + "Ваш возраст " + age + " лет");
    }

    //Вынес подсчет года в отдельный метод, просто потому что могу
    public static int calculateAge(int birthYear, int currentYear) {
        return currentYear - birthYear;
    }
}
