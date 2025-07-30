package Exam.Ex5;

public class Tulip extends Flower {
    public Tulip(String color, int price, int lifetime) {
        super(color, price, lifetime);
    }

    @Override
    protected String getName() {
        return "Тюльпан";
    }
}
