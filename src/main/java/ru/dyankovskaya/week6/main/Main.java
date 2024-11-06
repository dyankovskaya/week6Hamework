package ru.dyankovskaya.week6.main;

import ru.dyankovskaya.week6.task1.Task1;
import ru.dyankovskaya.week6.task2.Task2;
import ru.dyankovskaya.week6.task3.Task3;
import ru.dyankovskaya.week6.task4.Task4;
import ru.dyankovskaya.week6.task5.Task5;

public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        Task1.temperature();
        System.out.println("______________________________");

        System.out.println("task2");
        Task2.evenOrOdd();
        System.out.println("______________________________");

        System.out.println("task3");
        Task3.weekdays();
        System.out.println("______________________________");

        System.out.println("task4");
        Task4.subsequence();
        System.out.println();
        System.out.println("______________________________");

        System.out.println("task5");
        Task5.factorial();
    }
}