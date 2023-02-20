package ru.kolomytsev.course.six;

public class Dog extends Animal{
    public Dog(CounterAnimal counter, String name) {

        super(counter, name, 500, 10);
        counter.incrementDog();
    }

}
