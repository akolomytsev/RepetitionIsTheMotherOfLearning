package ru.kolomytsev.course2.one3;

public class Robot implements Athletes {
    private final String name;
    private static int counter;
    private final int jumpLimit = (int) (Math.random() * 100) +20;
    private final int runLimit= (int) (Math.random() * 100) + 90;

    public Robot() {
        counter++;
        name = "Robot # " + counter;
    }


    @Override
    public int jump() {
        return jumpLimit;
    }

    @Override
    public int run() {
        return runLimit;
    }

    @Override
    public String name() {
        return name;
    }
}
