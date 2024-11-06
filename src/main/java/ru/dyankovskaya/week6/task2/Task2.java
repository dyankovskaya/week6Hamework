package ru.dyankovskaya.week6.task2;

import java.util.Scanner;

//Напишите программу, в которой пользователь вводит целое число и она выводит на экран, является ли целое число,
// записанное в переменную n, чётным либо нечётным.
// Используйте тернарный оператор.

public class Task2 {

    public static void evenOrOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите целое число");
        int num = sc.nextInt();
        String res = num % 2 == 0 ? "введенное число - четное!" : "введенное число - нечетное!";
        System.out.println(res);
    }
}
