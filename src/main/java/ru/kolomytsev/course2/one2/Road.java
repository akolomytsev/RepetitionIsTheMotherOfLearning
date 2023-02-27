package ru.kolomytsev.course2.one2;

public class Road implements Obstacle{
    private static int size = ((int) (Math.random() * 100+1));

    @Override
    public boolean passedTheObstacle(Participant participant) {
        if (size <= participant.jump()){
            System.out.printf("Пользователь с именем %s пробежал дорогу%n", participant.getName());
            return true;
        }
        System.out.printf("Пользователь с именем %s выбыл из соревнований%n", participant.getName());
        return false;
    }
}
