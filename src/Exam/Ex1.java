package Exam;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secondsCount = scanner.nextInt();
        String resultTime = "";
        if (secondsCount >= 604800) {
            int weeksCount = secondsCount / 604800;
            String weekName = getWeeksName(weeksCount);
            resultTime = weeksCount + " " + weekName + " ";
            secondsCount = secondsCount % 604800;
        }
        if (secondsCount >= 86400) {
            int daysCount = secondsCount / 86400;
            String dayName = getDaysName(daysCount);
            resultTime = resultTime + daysCount + " " + dayName + " ";
            secondsCount = secondsCount % 86400;
        }
        if (secondsCount >= 3600) {
            int hoursCount = secondsCount / 3600;
            String hourName = getHoursName(hoursCount);
            resultTime = resultTime + hoursCount + " " + hourName + " ";
            secondsCount = secondsCount % 3600;
        }
        if (secondsCount >= 60) {
            int minutesCount = secondsCount / 60;
            String minuteName = getMinutesName(minutesCount);
            resultTime = resultTime + minutesCount + " " + minuteName + " ";
            secondsCount = secondsCount % 60;
        }
        String secondName = getSecondsName(secondsCount);
        resultTime = resultTime + secondsCount + " " + secondName + " ";
        System.out.print(resultTime);
    }

    private static String getWeeksName(int count) {
        if (count >= 1 && count <= 20) {
            return switchWeek(count);
        }
        if (count > 100 && count % 100 >= 1 && count % 100 <= 20) {
            return switchWeek(count % 100);
        } else {
            return switchWeek(count % 10);
        }
    }

    private static String switchWeek(int count) {
        return switch (count) {
            case 1 -> "неделя";
            case 2, 3, 4 -> "недели";
            default -> "недель";
        };
    }

    private static String getDaysName(int count) {
        if (count == 1) {
            return "сутки";
        } else {
            return "суток";
        }
    }

    private static String getHoursName(int count) {
        return switch (count) {
            case 1, 21 -> "час";
            case 2, 3, 4, 22, 23 -> "часа";
            default -> "часов";
        };
    }

    private static String getMinutesName(int count) {
        return switch (count) {
            case 1, 21, 31, 41, 51 -> "минута";
            case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> "минуты";
            default -> "минут";
        };
    }

    private static String getSecondsName(int count) {
        return switch (count) {
            case 1, 21, 31, 41, 51 -> "секунда";
            case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> "секунды";
            default -> "секунд";
        };
    }
}