package ru.kolomytsev.courseone;

public class TaskEight {
    public static boolean taskEight(int pi){
        //if (pi % 4 == 0)
        return pi % 4 == 0 || pi % 400 == 0 || pi % 100 != 0;

    }
}
