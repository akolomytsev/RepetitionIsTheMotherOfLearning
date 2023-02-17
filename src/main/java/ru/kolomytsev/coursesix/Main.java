package ru.kolomytsev.coursesix;

public class Main {
    public static void main(String[] args) {
        Cat kitty = new Cat("Vasilisa");
        Dog doggy = new Dog("Barmalei");

        kitty.run(190);
        doggy.run(450);
        doggy.swim(12);
        kitty.swim(500);
    }

}
