package Lb3;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//
import java.util.Random;

/*
Напишите программу, в которой создается массив и заполняется
случайными числами. Массив отображается в консольном окне. В этом
массиве необходимо определить элемент с минимальным значением. В
частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов

 */
public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[10];

        //псевдо рандом
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Получаем мин и индекс
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.println("\nМинимальное значение: " + minValue);
        System.out.print("Индекс'ы минимальных элементов: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minValue) {
                System.out.print(i + " ");
            }
        }
    }
}

