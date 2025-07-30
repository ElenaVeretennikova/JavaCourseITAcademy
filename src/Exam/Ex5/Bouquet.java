package Exam.Ex5;

import java.util.ArrayList;
import java.util.HashSet;

public class Bouquet {
    private final ArrayList<Flower> flowers;
    private final int bouquetPrice;
    private final int bouquetLifetime;
    private final HashSet<String> bouquetColors;

    public Bouquet(int flowersNumber) {
        ArrayList<Flower> bouquet = new ArrayList<>();
        for (int i = 0; i < flowersNumber; i++) {
            AvailableFlowers flower = AvailableFlowers.getRandomFlowerType();
            switch (flower) {
                case ROSE -> bouquet.add(new Rose(AvailableFlowerColors.getRandomFlowerColor(), 10, 7));
                case CARNATION -> bouquet.add(new Carnation(AvailableFlowerColors.getRandomFlowerColor(), 7, 9));
                case TULIP -> bouquet.add(new Tulip(AvailableFlowerColors.getRandomFlowerColor(), 8, 5));
                case LILY -> bouquet.add(new Lily(AvailableFlowerColors.getRandomFlowerColor(), 12, 8));
                case IRIS -> bouquet.add(new Iris(AvailableFlowerColors.getRandomFlowerColor(), 9, 7));
            }
        }
        flowers = bouquet;
        bouquetPrice = this.calculatePrice(flowers);
        bouquetLifetime = this.calculateLifetime(flowers);
        bouquetColors = this.extractBouquetColors(flowers);
    }

    public ArrayList<Flower> getFlowers() {
        return this.flowers;
    }

    public int getBouquetPrice() {
        return this.bouquetPrice;
    }

    public int getBouquetLifetime() {
        return this.bouquetLifetime;
    }

    public HashSet<String> getBouquetColors() {
        return this.bouquetColors;
    }

    private int calculatePrice(ArrayList<Flower> flowers) {
        int bouquetPrice = 0;
        for (Flower flower : flowers) {
            bouquetPrice += flower.getPrice();
        }
        return bouquetPrice;
    }

    private int calculateLifetime(ArrayList<Flower> flowers) {
        int bouquetLifetime = 0;
        for (Flower flower : flowers) {
            if (flower.getLifetime() >= bouquetLifetime) {
                bouquetLifetime = flower.getLifetime();
            }
        }
        return bouquetLifetime;
    }

    private HashSet<String> extractBouquetColors(ArrayList<Flower> flowers) {
        HashSet<String> bouquetColors = new HashSet<>();
        for (Flower flower : flowers) {
            bouquetColors.add(flower.getColor());
        }
        return bouquetColors;
    }
}
