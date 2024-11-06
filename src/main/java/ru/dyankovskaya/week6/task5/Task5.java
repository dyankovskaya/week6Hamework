package ru.dyankovskaya.week6.task5;

import java.util.Scanner;

// Создайте программу, вычисляющую факториал целого числа n, которое пользователь
// введёт с клавиатуры, используя цикл for.

public class Task5 {

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 1;
        for (int i = 2; i <= num; i++) {
            res = res * i;
        }
        System.out.println(res);
    }
}
