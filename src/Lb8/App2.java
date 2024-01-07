package Lb8;/*
 * Copyright (C) 2024 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
//Создать проект, позволяющий из одного, предварительно
//созданного программными средствами файла, переписать данные,
//соответствующие условию - в исходном файле содержится две строки в
//формате UTF-8 и 5 чисел типа double. В результирующий файл переписать
//вторую строку и положительные числа.
import java.io.*;

public class App2 {
    public static void main(String[] args) {
        // Путь к исходному файлу
        String sourceFilePath = "C:\\Sample\\UTest1.txt";
        // Путь к результирующему файлу
        String targetFilePath = "C:\\Sample\\UTest2.txt";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFilePath), "UTF-8"));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(targetFilePath), "UTF-8"))) {

            // Пропускаем первую строку
            br.readLine();

            // Чтение второй строки
            String line2 = br.readLine();

            // Запись второй строки в результирующий файл
            bw.write(line2);
            bw.newLine();

            // Чтение и запись положительных чисел
            String numbersString = br.readLine();
            String[] numbersArray = numbersString.split(" ");

            for (String number : numbersArray) {
                double num = Double.parseDouble(number);
                if (num > 0) {
                    bw.write(number);
                    bw.write(" ");
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
