package Lb1;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
import java.util.Scanner;
import java.lang.Math;

/*
Добавьте в пример расчета гипотенузы (см. раздел 2) метод, вычисляющий
ab. Используйте для этого функции расчета натурального логарифма и
экспоненты (y=exp(b*log(a));
 */
public class App18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину первого катета (a): ");
        double a = scanner.nextDouble();
        System.out.print("Введите длину второго катета (b): ");
        double b = scanner.nextDouble();
        double c = calculateHypotenuse(a, b);
        System.out.println("Гипотенуза (c) равна: " + Math.round(c)); //добавил еще округление
    }

    // Тот же класс Math, что и в 16 задаче
    public static double calculateHypotenuse(double a, double b) {
        return Math.exp(Math.log(a) + Math.log(b));
    }
}
