package Timus;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Scanner;

public class Task1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;
        if (N >= 1) {
            for (int i = 1; i <= N; i++) {
                sum += i;
            }
        } else {
            for (int i = 1; i >= N; i--) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}