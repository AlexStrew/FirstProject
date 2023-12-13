package Lb7;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//Напишите программу, в которой использована цепочка наследования из трех
//классов. В первом классе есть открытое символьное поле. Во втором классе появляется
//открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
//каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//значений полей, переданных аргументами конструктору, а также конструктор создания
//копии.
class FirstClass {
    public char charField;

    public FirstClass(char charField) {
        this.charField = charField;
    }

    public FirstClass(FirstClass original) {
        this.charField = original.charField;
    }
}

class SecondClass extends FirstClass {
    public String textField;

    public SecondClass(char charField, String textField) {
        super(charField);
        this.textField = textField;
    }

    public SecondClass(SecondClass original) {
        super(original.charField);
        this.textField = original.textField;
    }
}

class ThirdClass extends SecondClass {
    public int intField;

    public ThirdClass(char charField, String textField, int intField) {
        super(charField, textField);
        this.intField = intField;
    }

    public ThirdClass(ThirdClass original) {
        super(original.charField, original.textField);
        this.intField = original.intField;
    }
}

public class Task4 {
    public static void main(String[] args) {
        FirstClass obj1 = new FirstClass('A');
        FirstClass obj2 = new FirstClass(obj1);
        System.out.println(obj1.charField);
        System.out.println(obj2.charField);

        SecondClass obj3 = new SecondClass('B', "Hello");
        SecondClass obj4 = new SecondClass(obj3);
        System.out.println(obj3.charField + ", " + obj3.textField);
        System.out.println(obj4.charField + ", " + obj4.textField);

        ThirdClass obj5 = new ThirdClass('C', "World", 100);
        ThirdClass obj6 = new ThirdClass(obj5);
        System.out.println(obj5.charField + ", " + obj5.textField + ", " + obj5.intField);
        System.out.println(obj6.charField + ", " + obj6.textField + ", " + obj6.intField);
    }
}
