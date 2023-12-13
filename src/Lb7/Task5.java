package Lb7;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
//конструктор с текстовым параметром и метод, при вызове которого в консольном окне
//отображается название класса и значение поля. На основе суперкласса создаются два
//подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
//защищенное целочисленное поле, там есть конструктор с двумя параметрами и
//переопределен метод для отображения значений полей объекта и названия класса. Во
//втором подклассе появляется защищенное символьное поле, конструктор с двумя
//параметрами и переопределен метод, отображающий в консоли название класса и значения
//полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
//отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
//метод через объектную переменную суперкласса, которая ссылается на объект
//производного класса
class SuperClass5 {
    protected String textField;

    public SuperClass5(String textField) {
        this.textField = textField;
    }

    public void displayInfo() {
        System.out.println("Class: SuperClass, Text Field: " + textField);
    }
}

class FirstSubClass extends SuperClass5 {
    protected int intValue;

    public FirstSubClass(String textField, int intValue) {
        super(textField);
        this.intValue = intValue;
    }

    @Override
    public void displayInfo() {
        System.out.println("Class: FirstSubClass, Text Field: " + textField + ", Int Field: " + intValue);
    }
}

class SecondSubClass extends SuperClass5 {
    protected char charValue;

    public SecondSubClass(String textField, char charValue) {
        super(textField);
        this.charValue = charValue;
    }

    @Override
    public void displayInfo() {
        System.out.println("Class: SecondSubClass, Text Field: " + textField + ", Char Field: " + charValue);
    }
}

public class Task5 {
    public static void main(String[] args) {
        FirstSubClass firstObj = new FirstSubClass("Hello", 10);
        SecondSubClass secondObj = new SecondSubClass("World", 'A');

        firstObj.displayInfo();
        secondObj.displayInfo();

        SuperClass5 superClassRef = firstObj;
        superClassRef.displayInfo();
    }
}
