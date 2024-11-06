package ru.dyankovskaya.week6.task3;

import static java.time.DayOfWeek.*;

//Создайте Enum для дней недели. Присвойте любое значение дня недели переменной i и выведете на экран,
// какой день был задан - будний или выходной. Проверка должна быть корректна для каждого дня недели.
// Используйте оператор switch..case.

public class Task3 {

    public static void weekdays() {
        Enum i = SATURDAY;
        switch (i) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("Сегодня будний день!");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Сегодня выходной!");
                break;
            default:
                break;
        }
    }
}
