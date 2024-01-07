package Lb7;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
//базовом классе должен быть метод для присваивания значения полю: без параметров и с
//одним текстовым параметром. Объект суперкласса создается передачей одного текстового
//аргумента конструктору. Доступное только для чтения свойство результатом возвращает
//длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
//дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
//для присваивания значений полям (используется переопределение и перегрузка метода из
//суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
//текстовым и целочисленным параметром. У конструктора подкласса два параметра
//(целочисленный и текстовый).
class SuperClass1 {
    private String text;
    public SuperClass1(String text) {
        this.text = text;
    }
    public void setText() {
        this.text = "Default";
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setText(int number) {
        this.text = String.valueOf(number);
    }
    public void setText(String text, int number) {
        this.text = text + number;
    }
    public int getLength() {
        return text.length();
    }
    @Override
    public String toString() {
        return "SuperClass: " + text;
    }
}
class SubClass1 extends SuperClass1 {
    public int number;
    public SubClass1(int number, String text) {
        super(text);
        this.number = number;
    }
    @Override
    public void setText() {
        super.setText();
        this.number = 0;
    }
    @Override
    public void setText(String text) {
        super.setText(text);
        this.number = 0;
    }
    @Override
    public void setText(int number) {
        super.setText(number);
        this.number = number;
    }
    @Override
    public void setText(String text, int number) {
        super.setText(text, number);
        this.number = number;
    }
    @Override
    public String toString() {
        return "SubClass: " + super.toString() + ", number: " + number;
    }
}
public class Task2 {
    public static void main(String[] args) {
        SuperClass1 superClass = new SuperClass1("Hello");
        System.out.println(superClass);
        superClass.setText("Updated");
        System.out.println(superClass);
        System.out.println("Length: " + superClass.getLength());
        SubClass1 subClass = new SubClass1(10, "Sub");
        System.out.println(subClass);
        subClass.setText("Changed");
        System.out.println(subClass);
        System.out.println("Length: " + subClass.getLength());
    }
}