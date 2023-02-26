package ru.kolomytsev.course2.one2;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat(),
                new Cat(),
                new Cat(),
                new Human(),
                new Human(),
                new Human(),
                new Robot(),
                new Robot(),
                new Robot()
        };

        Obstacle[] obstacles = {
                new Wall(),
                new Wall(),
                new Treadmill(),
                new Treadmill()
        };

        for (Participant participant:participants) {
            for (Obstacle obstacle:obstacles) {
                if (!obstacle.performAction(participant)){
                    break;
                }
            }

        }


//        for (int i = 0; i < cat.length; i++) {
//            cat[i].run();
//            cat[i].jump();
//        }
//        cat.run();
//        cat.jump();
//        Wall wall = new Wall();
//        wall.wall();
    }
}
