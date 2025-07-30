package Exam.Ex5;

public class Rose extends Flower {
    public Rose(String color, int price, int lifetime) {
        super(color, price, lifetime);
    }

    @Override
    protected String getName() {
        return "Роза";
    }
}
