package Lb1;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
import java.util.Scanner;
import java.lang.Math;
/*
Используйте новый метод для расчета гипотенузы. Сделайте вариант
метода hyp() с параметрами.
 */
public class App19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину первого катета (a): ");
        double a = scanner.nextDouble();
        System.out.print("Введите длину второго катета (b): ");
        double b = scanner.nextDouble();
        double c = hyp(a, b); // <- ну типо вот
        System.out.println("Гипотенуза (c) равна: " + c);
    }
    public static double hyp(double a, double b) {
        return Math.exp(Math.log(a) + Math.log(b));
    }
}
