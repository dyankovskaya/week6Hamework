package ru.dyankovskaya.week6.task4;

//Выведете на экран последовательность чисел
//1 2 4 8 16 32 64 128 256 512, сначала используя цикл while, а затем do..while.

public class Task4 {

    public static void subsequence() {
        int num = 1;
        while(num <= 512) {
            System.out.print(num + " ");
            num = num * 2;
        }
        System.out.println();

        int num2 = 1;
        do {
            System.out.print(num2 + " ");
            num2 = num2 * 2;
        }while (num2 <= 512);
    }
}
