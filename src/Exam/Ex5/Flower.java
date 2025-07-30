package Exam.Ex5;

public abstract class Flower {
    private final String color;
    private final int price;
    private final int lifetime;

    public Flower(String color, int price, int lifetime) {
        this.color = color;
        this.price = price;
        this.lifetime = lifetime;
    }

    protected abstract String getName();

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getLifetime() {
        return lifetime;
    }

    @Override
    public String toString() {
        return getName();
    }
}
