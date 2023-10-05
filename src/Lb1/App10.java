package Lb1;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;
/*
Напишите программу, в которой Пользователь последовательно вводит
название текущего дня недели, название месяца и дату (номер дня в месяце).
Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).
 */
public class App10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String dayOfWeek = scanner.nextLine();
        // Чекаем на правильность написания дня недели
        if (!isValidDayOfWeek(dayOfWeek)) {
            System.out.println("Ahtung! Неверный день недели.");
            return;
        }
        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();
        System.out.print("Введите дату (номер дня в месяце): ");
        int dayOfMonth = scanner.nextInt();
        System.out.println("Сегодня " + dayOfWeek + ", " + dayOfMonth + " " + month);
        System.out.println("Просто было инстересно, как выводится системное время " + java.time.LocalDateTime.now());
    }

    // Почему бы не сделать проверку на правильность заполнения дня недели
    public static boolean isValidDayOfWeek(String dayOfWeek) {
        String[] arrayDaysOfWeek = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        for (String validDay : arrayDaysOfWeek) {
            if (validDay.equalsIgnoreCase(dayOfWeek)) {
                return true;
            }
        }
        return false;
    }
}
