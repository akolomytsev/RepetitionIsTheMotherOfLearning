package ru.kolomytsev.course2.one3;

public class Distance implements Obstacle{
    private final int size = (int) (Math.random()*100+1);

    @Override
    public int getSize() {
        return size;
    }

//    @Override
//    public boolean action(Athletes athletes) {
//        if (size<=athletes.run()){
//            System.out.printf("Участник с именем %s пробежал препятствие%n", athletes.getName());
//            return true;
//        }
//        System.out.printf("Участник с именем %s не пробежал препятствие и выбывает из соревнований%n", athletes.getName());
//        return false;
//    }
}
