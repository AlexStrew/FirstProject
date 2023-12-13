package Lb4;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

public class Example1 {
    public static void main(String[] args) {
        int figure = 10;
        int i, j , z;

        for (i = 1; i <= figure; i++) {
            System.out.println("номер строки: " + i + " ");
            z = 0;
            for (j = -5; j < figure; j++){
                System.out.println("+");
                z = z + 1;
            }
            System.out.println(" Кол-во символов в строке " + z);
        }
    }
}
