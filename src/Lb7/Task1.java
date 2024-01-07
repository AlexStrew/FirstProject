package Lb7;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//Напишите программу, в которой есть суперкласс с приватным текстовым полем,
//конструктором с текстовым параметром и где переопределен метод toString (). На основе
//суперкласса путем наследования создается подкласс. У него появляется еще одно
//приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
//В обоих классах метод toString () переопределяется так, что он возвращает строку с названием класса и значение текстового поля или текстовых полей.
class SuperClass {
    private String text;
    public SuperClass(String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return "SuperClass: " + text;
    }
}
class SubClass extends SuperClass {
    private String additionalText;
    public SubClass(String text) {
        super(text);
    }
    public SubClass(String text, String additionalText) {
        super(text);
        this.additionalText = additionalText;
    }
    @Override
    public String toString() {
        if (additionalText != null) {
            return "SubClass: " + getText() + ", " + additionalText;
        } else {
            return "SubClass: " + getText();
        }
    }
    private String getText() {
        return super.toString().substring(12); // Remove "SuperClass: " from the string
    }
}
public class Task1 {
    public static void main(String[] args) {
        SuperClass superObject = new SuperClass("Hello");
        System.out.println(superObject);
        SubClass subObject1 = new SubClass("Hi");
        System.out.println(subObject1);
        SubClass subObject2 = new SubClass("Hey", "There");
        System.out.println(subObject2);
    }
}