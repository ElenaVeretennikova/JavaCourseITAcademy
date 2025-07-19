package Credit;

import java.util.Random;

public class Unit03Ex03 {

    public static void main(String[] args) {
        int secCount = new Random().nextInt(28801);
        System.out.println("Количество секунд: " + secCount);
        System.out.println(getHoursCount(secCount));
    }

    public static String getHoursCount(int secCount) {

        if (secCount == 0) {
            return "Рабочий день закончился";
        }

        int hoursCount = secCount / 3600;
        String hourName = switch (hoursCount) {
            case 1 -> "час";
            case 2, 3, 4 -> "часа";
            default -> "часов";
        };
        return hoursCount > 0 ? "Осталось " + hoursCount + " " + hourName : "Осталось меньше часа";
    }
}
