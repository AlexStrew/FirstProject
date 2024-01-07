package Lb6;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//Напишите программу с классом, в котором есть закрытое статическое
//целочисленное ноле с начальным нулевым значением. В классе должен быть описан
//статический метод, при вызове которого отображается текущее значение статического
//поля, после чего значение поля увеличивается на единицу.
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
