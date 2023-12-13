package Lb6;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//Напишите программу с классом, в котором есть два поля: символьное и текстовое.
//В классе должен быть перегруженный метод для присваивания значений полям. Если метод
//вызывается с символьным аргументом, то соответствующее значение присваивается
//символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
//значение текстового ноля. Методу аргументом также может передаваться символьный
//массив. Если массив состоит из одного элемента, то он определяет значение символьного
//поля. В противном случае (если в массиве больше одного элемента) из символов массива
//формируется текстовая строка и присваивается значением текстовому полю
public class Task1 {
    private char charField;
    private String textField;

    public void setValue(char value) {
        charField = value;
    }

    public void setValue(String value) {
        textField = value;
    }

    public void setValue(char[] value) {
        if (value.length == 1) {
            charField = value[0];
        } else {
            textField = new String(value);
        }
    }

    public void displayValues() {
        System.out.println("Символьное поле: " + charField);
        System.out.println("Текстовое поле: " + textField);
    }

    public static void main(String[] args) {
        Task1 fields = new Task1();

        fields.setValue('A');
        fields.displayValues();

        fields.setValue("Hello");
        fields.displayValues();

        char[] charArray = {'T', 'e', 'x', 't'};
        fields.setValue(charArray);
        fields.displayValues();
    }
}