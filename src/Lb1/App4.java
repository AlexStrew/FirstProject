package Lb1;

/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;


public class App4 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        System.out.print("Input a number:");
        int num = InCMD.nextInt();
        System.out.printf("Your number: %d \n", num);
        InCMD.close();
    }
}
