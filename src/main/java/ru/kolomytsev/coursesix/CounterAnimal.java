package ru.kolomytsev.coursesix;

public class CounterAnimal {
    int dogCounter;
    int catCounter;
    int animalCounter;

    public void incrementDog(){
        dogCounter++;
    }
    public void incrementCat(){
        catCounter++;
    }
    public void incrementAnimal(){
        animalCounter++;
    }

    public int getDogCounter() {
        return dogCounter;
    }

    public int getCatCounter() {
        return catCounter;
    }

    public int getAnimalCounter() {
        return animalCounter;
    }
}
