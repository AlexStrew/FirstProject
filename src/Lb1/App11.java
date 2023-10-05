package Lb1;/*
 * Copyright (C) 2023 Wilastian. - All Rights Reserved
 *
 * Unauthorized copying or redistribution of this file in source and binary forms via any medium
 * is strictly prohibited.
 */
import java.util.Scanner;
import java.time.YearMonth;
/*
Напишите программу, в которой пользователю предлагается ввести
название месяца и количество дней в этом месяце. Программа выводит
сообщение о том, что соответствующий месяц содержит указанное количество
дней.
 */
public class App11 {
    //Небольшое дополнение задания, добавлена проверка, правда ли в Этом году и в указанном месяце столько дней
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String monthName = scanner.nextLine();
        System.out.print("Введите количество дней в этом месяце: ");
        int daysInMonth = scanner.nextInt();
        if (isValidMonthDays(monthName, daysInMonth)) {
            System.out.println("Месяц " + monthName + " в текущем году содержит " + daysInMonth + " дней.");
        } else {
            //Выводим строку, чтоб выполнить тз
            System.out.println("Месяц " + monthName + " в текущем году содержит " + daysInMonth + " дней.");
            //Вывод для души
            System.out.println("Неправильное количество дней для указанного месяца.");
        }
    }

    // Ну почти как на шарпе
    public static boolean isValidMonthDays(String monthName, int daysInMonth) {
        YearMonth currentYearMonth = YearMonth.now();
        int daysInCurrentMonth = currentYearMonth.lengthOfMonth();
        return daysInMonth == daysInCurrentMonth;
    }
}

