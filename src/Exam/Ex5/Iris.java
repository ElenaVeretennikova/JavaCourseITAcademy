package Exam.Ex5;

public class Iris extends Flower {
    public Iris(String color, int price, int lifetime) {
        super(color, price, lifetime);
    }

    @Override
    protected String getName() {
        return "Ирис";
    }
}
