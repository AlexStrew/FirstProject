package Lb3;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;

/*
Напишите программу, в которой пользователь вводит целое число
в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
Если введенное пользователем число выходит за допустимый диапазон,
выводится сообщение о том, что введено некорректное значение. Используйте
оператор выбора switch.
 */
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 7: ");
        int day = scanner.nextInt();

        String dayOfWeek;
        switch (day) {
            case 1: dayOfWeek = "Понедельник"; break;
            case 2: dayOfWeek = "Вторник"; break;
            case 3: dayOfWeek = "Среда"; break;
            case 4: dayOfWeek = "Четверг"; break;
            case 5: dayOfWeek = "Пятница"; break;
            case 6: dayOfWeek = "Суббота"; break;
            case 7: dayOfWeek = "Воскресенье"; break;
            default: dayOfWeek = "Некорректное значение";
        }

        System.out.println("День недели: " + dayOfWeek);
    }
}