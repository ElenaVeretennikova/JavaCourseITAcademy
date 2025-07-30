package Exam.Ex5;

import java.util.Random;

public enum AvailableFlowers {
    ROSE,
    CARNATION,
    TULIP,
    LILY,
    IRIS;

    public static AvailableFlowers getRandomFlowerType() {
        int ordinal = new Random().nextInt(AvailableFlowers.values().length);
        return AvailableFlowers.values()[ordinal];
    }
}