package Lb3;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
/*
Напишите программу, в которой создается одномерный
символьный массив из 10 элементов. Массив заполняется буквами «через
одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
порядке. Размер массива задается переменной
 */
public class Task7 {
    public static void main(String[] args) {
        int size = 10;
        char[] charArray = new char[size];
        char letter = 'a';

        for (int i = 0; i < size; i++) {
            charArray[i] = letter;
            letter += 2; // Через одну букву
        }

        System.out.print("Массив в прямом порядке: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nМассив в обратном порядке: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
    }
}