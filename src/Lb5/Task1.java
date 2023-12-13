package Lb5;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;
//Напишите программу с классом, в котором есть закрытое символьное поле
//и три открытых метода. Один из методов позволяет присвоить значение полю.
//Еще один метод при вызове возвращает результатом код символа. Третий
//метод позволяет вывести в консольное окно символ (значение поля) и его код
public class Task1 {
    private char symbol; // закрытое символьное поле

    public void setSymbolFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ: ");
        symbol = scanner.next().charAt(0);
    }


    public int getSymbolCode() { //бэк код символа
        return (int) symbol;
    }

    public void printSymbolAndCode() { //сам символ + код
        System.out.println("Символ: " + symbol);
        System.out.println("Код символа: " + (int) symbol);
    }

    public static void main(String[] args) {
        Task1 symbolOps = new Task1();

        symbolOps.setSymbolFromInput();

        symbolOps.printSymbolAndCode();

        int code = symbolOps.getSymbolCode();
        System.out.println("Код символа: " + code);
    }
}
