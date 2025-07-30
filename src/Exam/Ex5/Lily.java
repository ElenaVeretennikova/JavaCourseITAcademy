package Exam.Ex5;

public class Lily extends Flower {
    public Lily(String color, int price, int lifetime) {
        super(color, price, lifetime);
    }

    @Override
    protected String getName() {
        return "Лилия";
    }
}
