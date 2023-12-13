package Lb7;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

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
