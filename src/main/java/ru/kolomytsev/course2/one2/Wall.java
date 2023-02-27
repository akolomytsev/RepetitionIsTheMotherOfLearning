package ru.kolomytsev.course2.one2;

public class Wall  implements Obstacle{

    private static int height = ((int) (Math.random() * 100+1));


    @Override
    public boolean passedTheObstacle(Participant participant) {
        if (height <= participant.jump()){
            System.out.printf("Пользователь с именем %s перепрыгнул преграду%n", participant.getName());
            return true;
        }
        System.out.printf("Пользователь с именем %s выбыл из соревнований%n", participant.getName());
        return false;
    }
}
