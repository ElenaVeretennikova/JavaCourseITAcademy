package Exam.Ex6;

import java.util.ArrayList;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(12345, "Я иду искать!");

        System.out.println("Исходная пара: " + pair);
        System.out.println("Первый элемент: " + pair.first());
        System.out.println("Второй элемент: " + pair.second());
        System.out.println("Пара после смены элементов': " + pair.swap());

        Boolean b = true;
        System.out.println("Замена первого элемента на любой: " + pair.replaceFirst(b));
        System.out.println("Замена второго элемента на любой: " + pair.replaceSecond(b));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(67);
        list.add(99);
        System.out.println("Замена первого элемента на любой: " + pair.replaceFirst(list));
        System.out.println("Замена второго элемента на любой: " + pair.replaceSecond(list));

        System.out.println("Замена первого элемента на любой: " + pair.replaceFirst(null));
        System.out.println("Замена второго элемента на любой: " + pair.replaceSecond(null));
    }
}
