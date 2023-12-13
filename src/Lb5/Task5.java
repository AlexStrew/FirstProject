package Lb5;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//Напишите программу с классом, у которого есть закрытое целочисленное
//поле. Значение полю присваивается с помощью открытого метода. Методу
//аргументом может передаваться целое число, а также метод может вызываться
//без аргументов. Если методы вызывается без аргументов, то поле получает
//нулевое значение. Если метод вызывается с целочисленным аргументом, то
//это значение присваивается полю. Однако если переданное аргументом
//методу значение превышает 100, то значением полю присваивается число 100.
//Предусмотрите в классе конструктор, который работает по тому же принципу
//что и метод для присваивания значения полю. Также в классе должен быть
//метод, позволяющий проверить значение поля
public class Task5 {
    private int value;

    public Task5() {
        setValue(0);
    }

    public void setValue(int newValue) {
        value = (newValue > 100) ? 100 : newValue; // присваиваем 100 если больше 100
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Task5 field = new Task5();

        field.setValue(150);
        System.out.println("Значение поля после установки: " + field.getValue());

        field.setValue(0);
        System.out.println("Значение поля после установки без аргументов: " + field.getValue());
    }
}
