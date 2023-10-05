package Lb1;
/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;
/*
Напишите программу, в которой Пользователь вводит сначала фамилию,
затем имя, затем отчество. После ввода программа выводит сообщение «Hallo
<ФАМИЛИЯ, ИМЯ, ОТЧЕСТВО>».
 */
public class App8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your First name: ");
        String fName = in.nextLine();
        System.out.print("Input your Last name: ");
        String lName = in.nextLine();
        System.out.print("Input your Patronomic: ");
        String patronomic = in.nextLine();
        //Окей, это странная конструкция
        System.out.printf("Shalom! %s %s %s", fName, lName, patronomic);
        in.close();
    }
}
