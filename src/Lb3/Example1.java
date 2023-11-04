package Lb3;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner id  = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        System.out.println("Размаер массива: " + size);
        int[] nums = new int[size];
        Random random = new Random();

        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);
        }

        Arrays.sort(nums);
        System.out.println("Сортировака массива");
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]);
        }
    }
}
