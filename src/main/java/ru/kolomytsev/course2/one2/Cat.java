package ru.kolomytsev.course2.one2;

public class Cat implements Participant {
    private final String name;
    private static int counter = 0;
    private final int jumpingAbility = (int) (Math.random()*100+1+5);

    private final int endurance = (int) (Math.random()*100+1+5);
    public Cat() {
        counter++;
        name = "Cat " + counter;
    }

    @Override
    public int jump() {
        return jumpingAbility;
    }

    @Override
    public int run() {
        return endurance;
    }

    @Override
    public String getName() {
        return name;
    }
}
