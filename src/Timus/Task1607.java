package Timus;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
/*
1607. Такси
Исходные данные
В единственной строке даны 4 целых числа: a — стартовая цена Пети, b — надбавка Пети к своей цене, c — стартовая цена таксиста, d — скидка таксиста к своей цене (1 ≤ a, b, c, d ≤ 10000).
Результат
Выведите сумму, которую Петя заплатит за проезд.
Пример
исходные данные	результат
150 50 1000 100
450
 */
import java.util.Scanner;
public class Task1607 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем значения a, b, c и d
        int a = scanner.nextInt(); // Стартовая цена Пети
        int b = scanner.nextInt(); // Надбавка Пети
        int c = scanner.nextInt(); // Стартовая цена таксиста
        int d = scanner.nextInt(); // Скидка таксиста

        // Если стартовая цена Пети больше или равна стартовой цене таксиста, нет необходимости торговаться
        if (c <= a) {
            System.out.println(a);
            return;
        }

        while (true) {
            // Если цена Пети плюс надбавка меньше стартовой цены таксиста, Петя повышает цену
            if (a + b < c) {
                a += b;
            } else {
                a = c;
                break;
            }

            // Если цена таксиста минус скидка больше текущей цены Пети, то таксист снижает цену
            if (c - d > a) {
                c -= d;
            } else {
                c = a;
                break;
            }
        }

        // Ожидается что равны
        assert a == c;

        // Выводим минимальную цену
        System.out.println(a);
    }
}