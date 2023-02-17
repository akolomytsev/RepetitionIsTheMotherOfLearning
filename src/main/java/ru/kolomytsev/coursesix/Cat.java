package ru.kolomytsev.coursesix;

public class Cat extends Animal{
    public Cat(String name) {
        super(name, 200, 0);
    }

    @Override
    public void swim(int b) {
        System.out.printf("%s не умеет плавать", getName());
    }
}
