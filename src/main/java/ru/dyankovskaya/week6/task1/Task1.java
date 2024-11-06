package ru.dyankovskaya.week6.task1;

import java.util.Scanner;

// Попросите пользователя ввести c клавиатуры температуру целым числом.
// Если она меньше 0, выведете на экран строку “Сейчас очень холодно”.
// Если она от 0 до 16, выведете на экран строку “Сейчас прохладно”.
// В другом случае выведете на экран строку “Отличный летний денек!”.
// Используйте оператор if..else.

public class Task1 {

    public static void temperature() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите температуру");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Сейчас очень холодно!");
        } else if (num > 16) {
            System.out.println("Отличный летний денек!");
        } else {
            System.out.println("Сейчас прохладно");
        }
    }
}
