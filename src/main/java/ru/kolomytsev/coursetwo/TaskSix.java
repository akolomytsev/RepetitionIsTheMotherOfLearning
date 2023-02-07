package ru.kolomytsev.coursetwo;

//Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место,
// в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
// checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
public class TaskSix {
    public static void main(String[] args) {
        int[] g = {5, 5, 5, 15};
        for (int i = 0; i < g.length; i++) {
            System.out.print(g[i] + " ");
        }
    }
}
