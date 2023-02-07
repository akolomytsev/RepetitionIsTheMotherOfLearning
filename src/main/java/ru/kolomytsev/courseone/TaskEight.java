package ru.kolomytsev.courseone;

public class TaskEight {
    public static boolean taskEight(int pi){
        return pi % 4 == 0 || pi % 400 == 0 && pi % 100 != 0;

    }
}
