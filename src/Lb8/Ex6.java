package Lb8;/*
 * Copyright (C) 2024 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */

import java.io.*;

public class Ex6 {
    public static void main(String[] args) throws IOException {
        Reader in = null; // можно сразу записать FileReader in=null;
        Writer out = null; // можно сразу записать FileWriter out =null;
        try {
            in = new FileReader("E:\\MyFile1.txt"); // файл для чтения
            out = new FileWriter("E:\\MyFile2.txt", true); // файл для записи
            // Данные считываются и записываются побайтно, как и для
            // InputStream/OutputStream
            int oneByte; // переменная, в которую считываются данные
            while ((oneByte = in.read()) != -1) {
                // out.write((char)oneByte); // запись с уничтожением ранее
                // существующих данных
                out.append((char) oneByte); // запись с добавлением данных в конец
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();
        }
    }
}