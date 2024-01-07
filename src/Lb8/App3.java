package Lb8;/*
 * Copyright (C) 2024 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.io.*;

//Создать проект, позволяющий из одного текстового файла,
//содержащего несколько строк (тип String) заранее подготовленного текста
//на русском языке (Пушкин, Лермонтов или другой российсмки классик на
//Ваш вкус), построчно переписать в другой текстовый файл слова
//начинающиеся с согласных букв..
//Требования:
//– слова из предложения выделять методом split();
//– в новом файле следует указать номер строки, в которой иско- мые
//слова находились в исходном файле;
//– для каждой строки указать количество выбранных слов.
public class App3 {
    public static void main(String[] args) {
        String sourceFilePath = "C:\\Sample\\UTest1.txt";
        String targetFilePath = "C:\\Sample\\UTest2.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(targetFilePath))) {
            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                int consonantWordCount = 0;

                for (String word : words) {
                    if (word.matches("[БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ].*")) {
                        bw.write("Строка " + lineNumber + ": " + word + "\n");
                        consonantWordCount++;
                    }
                }
                if (consonantWordCount > 0) {
                    bw.write("В строке " + lineNumber + " найдено слов, начинающихся с согласных: " + consonantWordCount + "\n\n");
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}

