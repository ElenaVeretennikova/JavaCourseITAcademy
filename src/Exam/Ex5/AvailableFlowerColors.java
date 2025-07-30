package Exam.Ex5;

import java.util.Random;

public enum AvailableFlowerColors {
    RED("красный"),
    WHITE("белый"),
    YELLOW("желтый"),
    PINK("розовый"),
    VIOLET("фиолетовый");
    private final String name;

    AvailableFlowerColors(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static String getRandomFlowerColor() {
        int ordinal = new Random().nextInt(AvailableFlowerColors.values().length);
        return AvailableFlowerColors.values()[ordinal].getName();
    }
}
