package FinalTest.Ex3;

import java.util.Random;

public enum CarModel {
    POLO,
    PASSAT,
    CALIFORNIA;

    public static CarModel getRandomCarModel() {
        int ordinal = new Random().nextInt(CarModel.values().length);
        return CarModel.values()[ordinal];
    }
}
