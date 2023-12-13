package Lb5;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//Напишите программу с классом, в котором есть два закрытых
//целочисленных поля (назовем их max и min). Значение поля max не может
//быть меньше значения поля min. Значения полям присваиваются с помощью
//открытого метода. Метод может вызываться с одним или двумя
//целочисленными аргументами. При вызове метода значения полям
//присваиваются так: сравниваются текущие значения полей и значения
//аргументов, переданных методу. Самое большое из значений присваивается
//полю max, а самое маленькое из значений присваивается полю min.
//Предусмотрите конструктор, который работает по тому же принципу, что и
//метод для присваивания значений полям. В классе также должен быть метод,
//отображающий в консольном окне значения полей объекта.
public class Task6 {
    private int max;
    private int min;

    public Task6() {
        setMinMax(0, 0);
    }

    public void setMinMax(int value1, int value2) {
        max = Math.max(value1, value2);
        min = Math.min(value1, value2);
    }

    public void outValues() {
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    public static void main(String[] args) {
        Task6 values = new Task6();

        values.setMinMax(10, 5);
        values.outValues();

        values.setMinMax(3, 8);
        values.outValues();

        values.setMinMax(0, 15);
        values.outValues();
    }
}
