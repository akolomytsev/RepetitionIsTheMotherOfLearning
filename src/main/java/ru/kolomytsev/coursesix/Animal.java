package ru.kolomytsev.coursesix;

public abstract class Animal {
    private String name;
    private int maxRun;
    private int maxSwim;

    public String getName() {
        return name;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int a){
        if (a < maxRun){
            System.out.printf("%s run distance %s%n", name, a);
        } else
            System.out.printf("%s не смог пробежать %n", name);
    }
    public void swim(int b){
        if (b < maxSwim){
            System.out.printf("%s swim distance %s%n", name, b);
        } else
            System.out.printf("%s не смог доплыть %n", name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public Animal(String name) {
        this.name = name;
    }
}
