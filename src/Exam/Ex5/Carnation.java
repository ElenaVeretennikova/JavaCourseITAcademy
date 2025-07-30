package Exam.Ex5;

public class Carnation extends Flower {
    public Carnation(String color, int price, int lifetime) {
        super(color, price, lifetime);
    }

    @Override
    protected String getName() {
        return "Гвоздика";
    }
}
