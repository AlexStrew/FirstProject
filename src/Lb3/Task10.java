package Lb3;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//псевдо
import java.util.Arrays;
import java.util.Random;

/*
Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого значения элементов в
массиве сортируются в порядке убывания значений.
 */
public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[10];

        //Псевдо
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(100);
        }

        //вывод исх масс
        System.out.print("Исходный массив: ");
        for (int num : array)
        {
            System.out.print(num + " ");
        }

        //sort
        Arrays.sort(array);
        int[] descArray = new int[array.length];
         for(int i = 0; i < array.length; i++)
         {
             descArray[i] = array[array.length - 1 - i];
         }

        System.out.print("\nМассив в порядке убывания: ");
         for (int num : descArray)
         {
             System.out.print(num + " ");
         }
    }
}
