package Timus;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistributionum of this file inum source and binary forms via any medium
 * is strictly prohibited.
 */
import java.util.Scanner;
public class Task1785 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String result = "";
        if (num >= 1 && num <= 4) {
            result = "few";
        } else if (num >= 5 && num <= 9) {
            result = "several";
        } else if (num >= 10 && num <= 19) {
            result = "pack";
        } else if (num >= 20 && num <= 49) {
            result = "lots";
        } else if (num >= 50 && num <= 99) {
            result = "horde";
        } else if (num >= 100 && num <= 249) {
            result = "throng";
        } else if (num >= 250 && num <= 499) {
            result = "swarm";
        } else if (num >= 500 && num <= 999) {
            result = "zounds";
        } else if (num >= 1000) {
            result = "legion";
        }
        System.out.println(result);
    }
}