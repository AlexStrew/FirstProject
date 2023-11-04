package Lb3;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;

/*
Напишите программу, в которой пользователю предлагается
ввести название дня недели. По введенному названию программа определяет
порядковый номер дня в неделе. Если пользователь вводит неправильное
название дня, программа выводит сообщение о том, что такого дня нет.
Предложите версию программы на основе вложенных условных операторов и
на основе оператора выбора switch
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String dayName = scanner.nextLine();

        int dayNumber;
        switch (dayName.toLowerCase()) {
            case "понедельник": dayNumber = 1; break;
            case "вторник": dayNumber = 2; break;
            case "среда": dayNumber = 3; break;
            case "четверг": dayNumber = 4; break;
            case "пятница": dayNumber = 5; break;
            case "суббота": dayNumber = 6; break;
            case "воскресенье": dayNumber = 7; break;
            default: dayNumber = -1; // Нет такого дня
        }

        if (dayNumber != -1) {
            System.out.println("Порядковый номер дня: " + dayNumber);
        } else {
            System.out.println("Такого дня нет.");
        }
    }
}