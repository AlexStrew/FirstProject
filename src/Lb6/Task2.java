package Lb6;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

public class Task2 {
    private static int number = 0;

    public static void displayAndIncrement() {
        System.out.println("Текущее значение статического поля: " + number);
        number++;
    }

    public static void main(String[] args) {    //не особо понял, но надеюсь так
        Task2.displayAndIncrement();
        Task2.displayAndIncrement();
        Task2.displayAndIncrement();
    }
}
