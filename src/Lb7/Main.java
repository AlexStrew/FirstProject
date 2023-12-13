package Lb7;

/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//Напишите программу, в которой есть суперкласс с приватным текстовым полем,
//конструктором с текстовым параметром и где переопределен метод toString (). На основе
//суперкласса путем наследования создается подкласс. У него появляется еще одно
//приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
//двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
//В обоих классах метод toString () переопределяется так, что он возвращает строку с
//названием класса и значение текстового поля или текстовых полей
public class Main {
    public static void main(String[] args) {
        SuperClassTest superClassObject =
                new SuperClassTest("Передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        SubClassTest subClassObject1 =
                new SubClassTest("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        SubClassTest subClassObject2 =
                new SubClassTest("передал в констр подкласса", "где два парама");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
class SubClassTest extends SuperClassTest {

    private String str2;
    private String str3;

    SubClassTest(String strEx) {
        super(strEx);
    }

    SubClassTest(String strEx2, String strEx3) {
        this.str2 = strEx2;
        this.str3 = strEx3;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str 1 = " + this.getStr1() + "\n" +
                "str 1 = " + this.str2 + "\n" +
                "str 1 = " + this.str3;
        return ClassNameAndFieldValue;

    }

    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
}

class SuperClassTest {
    private String str1;

    SuperClassTest(String strEx) {
        this.str1 = strEx;
    }

    SuperClassTest() {

    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "str 1 = " + this.getStr1();
        return superClassNameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
