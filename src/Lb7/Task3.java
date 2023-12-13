package Lb7;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//Напишите программу, в которой на основе суперкласса создается подкласс, а на
//основе этого подкласса создается еще один подкласс (цепочка наследования из трех
//классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
//параметром для присваивания значения полю и конструктор с одним параметром. Во
//втором классе появляется открытое символьное поле, метод с двумя параметрами для
//присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
//параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
//аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
//конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
//чтобы он возвращал строку с названием класса и значениями всех полей объекта.
class SuperClass2 {
    public int intValue;

    public SuperClass2(int intValue) {
        this.intValue = intValue;
    }

    public void setValue(int value) {
        this.intValue = value;
    }

    @Override
    public String toString() {
        return "SuperClass: intValue=" + intValue;
    }
}

class SubClass2 extends SuperClass2 {
    public char charValue;

    public SubClass2(int intValue, char charValue) {
        super(intValue);
        this.charValue = charValue;
    }

    public void setValue(int value, char ch) {
        super.setValue(value);
        this.charValue = ch;
    }

    @Override
    public String toString() {
        return "SubClass: intValue=" + intValue + ", charValue=" + charValue;
    }
}

class SubSubClass2 extends SubClass2 {
    public String stringValue;

    public SubSubClass2(int intValue, char charValue, String stringValue) {
        super(intValue, charValue);
        this.stringValue = stringValue;
    }

    public void setValue(int value, char ch, String str) {
        super.setValue(value, ch);
        this.stringValue = str;
    }

    @Override
    public String toString() {
        return "SubSubClass: intValue=" + intValue + ", charValue=" + charValue + ", stringValue=" + stringValue;
    }
}

public class Task3 {
    public static void main(String[] args) {
        SuperClass2 superObj = new SuperClass2(10);
        System.out.println(superObj);

        SubClass2 subObj = new SubClass2(20, 'A');
        System.out.println(subObj);

        SubSubClass2 subSubObj = new SubSubClass2(30, 'B', "Hello");
        System.out.println(subSubObj);
    }
}
