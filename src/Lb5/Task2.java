package Lb5;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;
//Напишите программу с классом, у которого есть два символьных поля и
//метод. Он возвращает результат, и у него нет аргументов. При вызове метод
//выводит в консольное окно все символы из кодовой таблицы, которые
//находятся «между» символами, являющимися значениями полей объекта (из
//которого вызывается метод). Например, если полям объекта присвоены
//значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
//выводиться все символы от ‘A’ до ‘D’ включительно
public class Task2 {
    private char startChar;
    private char endChar;

    public void setCharactersFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первый символ: ");
        startChar = scanner.next().charAt(0);

        System.out.print("Введите второй символ: ");
        endChar = scanner.next().charAt(0);
    }

    public void printCharactersInRange() {
        int start = Math.min(startChar, endChar);
        int end = Math.max(startChar, endChar);

        for (int i = start; i <= end; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task2 charRange = new Task2();
        charRange.setCharactersFromInput();
        charRange.printCharactersInRange();
    }
}