package ru.kolomytsev.coursesix;

public class Dog extends Animal{
    public Dog(CounterAnimal counter, String name) {

        super(counter, name, 500, 10);
        counter.incrementDog();
    }

}
