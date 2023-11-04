package Lb3;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
/*
Напишите программу, в которой создается символьный массив из
10 элементов. Массив заполнить большими (прописными) буквами
английского алфавита. Буквы берутся подряд, но только согласные (то есть
гласные буквы ’ А ' , 'Е ' и ' I ' при присваивании значений элементам массива
нужно пропустить). Отобразите содержимое созданного массива в консольном
окне.
 */

public class Task8 {
    // Я так понял, что мы не ручками заносим данные в массив
    public static void main(String[] args) {
        char[] letter = new char[10];
        char currentChar = 'A';

        for (int i = 0; i < 10; i++) {
            // Скипаем гласные буквы 'A', 'E' и 'I'
            while (currentChar == 'A' || currentChar == 'E' || currentChar == 'I') {
                currentChar++;
            }

            letter[i] = currentChar;
            currentChar++;
        }

        // Вывод
        for (char c : letter) {
            System.out.print(c + " ");
        }
    }
}