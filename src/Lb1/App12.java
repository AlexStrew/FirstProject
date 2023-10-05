package Lb1;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
import java.util.Scanner;
import java.time.LocalDate;
/*
Напишите программу, в которой по году рождения определяется возраст
пользователя.
 */
public class App12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год вашего рождения: ");
        int birthYear = scanner.nextInt();
        //LocalDate
        int currentYear = LocalDate.now().getYear();
        int age = calculateAge(birthYear, currentYear);
        System.out.println("Ваш возраст: " + age + " лет");
    }

    //Вынес подсчет года в отдельный метод, просто потому что могу
    public static int calculateAge(int birthYear, int currentYear) {
        return currentYear - birthYear;
    }
}
