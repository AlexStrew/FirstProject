package Timus;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
/*
1601. АнтиКАПС
Правила исправлений очень просты:
Предложения в сообщении состоят из слов, пробелов и знаков препинания.
Слова состоят из букв латинского алфавита.
Предложения оканчиваются точкой, восклицательным или вопросительным знаком.
Первое слово в предложении должно начинаться с заглавной буквы, все остальные буквы в предложении должны быть строчными.
Исходные данные
Входные данные содержат сообщение Анжелы, которое состоит из латинских букв в верхнем регистре, пробелов, переводов строк и знаков препинания: точек, запятых, тире, двоеточий, восклицательных и вопросительных знаков. Общая длина сообщения не превосходит 10000 символов.
Результат
Выведите исправленное сообщение Анжелы.
Пример
исходные данные	результат
HI THERE!
HOW DID YOU KNOW I AM A BLONDE?
Hi there!
How did you know i am a blonde?
 */
import java.util.Scanner;
public class Task1601 {
    // Делал опираясь на пример написанный на C++
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true; // Флаг для отслеживания, следует ли сделать следующую букву заглавной
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // объект для сборки строки
            StringBuilder result = new StringBuilder();

            // foreach
            for (char c : line.toCharArray()) {
                c = Character.toLowerCase(c); //посимвольно в нижний регистр

                // Если символ является буквой, то сделать БОЛЬШОЙ
                if (c >= 'a') {
                    if (flag) {
                        result.append(Character.toUpperCase(c)); // Делаем символ заглавной буквой и отвправляем в результат
                        flag = false; // Снимаем флаг
                    } else {
                        result.append(c); // В остальных случаях добавляем символ как есть, то есть строчный
                    }
                } else { // Если символ не является буквой
                    if (c == '!' || c == '.' || c == '?') {
                        flag = true; // Если символ - знак препинания, ставим флаг
                    }
                    result.append(c); // Добавляем символ как есть
                }
            }
            System.out.println(result.toString());
        }
    }
}