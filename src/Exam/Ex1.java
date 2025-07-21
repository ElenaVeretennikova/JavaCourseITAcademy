package Exam;

import java.util.Scanner;

public class Ex1 {

    public static final int SEC_NUMBER_IN_WEEK = 604800;
    public static final int SEC_NUMBER_IN_DAY = 86400;
    public static final int SEC_NUMBER_IN_HOUR = 3600;
    public static final int SEC_NUMBER_IN_MINUTE = 60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secondsCount = scanner.nextInt();
        String resultTime = "";
        if (secondsCount >= SEC_NUMBER_IN_WEEK) {
            int weeksCount = secondsCount / SEC_NUMBER_IN_WEEK;
            String weekName = getWeeksName(weeksCount);
            resultTime = weeksCount + " " + weekName + " ";
            secondsCount = secondsCount % SEC_NUMBER_IN_WEEK;
        }
        if (secondsCount >= SEC_NUMBER_IN_DAY) {
            int daysCount = secondsCount / SEC_NUMBER_IN_DAY;
            String dayName = getDaysName(daysCount);
            resultTime = resultTime + daysCount + " " + dayName + " ";
            secondsCount = secondsCount % SEC_NUMBER_IN_DAY;
        }
        if (secondsCount >= SEC_NUMBER_IN_HOUR) {
            int hoursCount = secondsCount / SEC_NUMBER_IN_HOUR;
            String hourName = getHoursName(hoursCount);
            resultTime = resultTime + hoursCount + " " + hourName + " ";
            secondsCount = secondsCount % SEC_NUMBER_IN_HOUR;
        }
        if (secondsCount >= SEC_NUMBER_IN_MINUTE) {
            int minutesCount = secondsCount / SEC_NUMBER_IN_MINUTE;
            String minuteName = getMinutesName(minutesCount);
            resultTime = resultTime + minutesCount + " " + minuteName + " ";
            secondsCount = secondsCount % SEC_NUMBER_IN_MINUTE;
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
        if (count > 0 && count <= 10 || count >= 15 && count <= 59) {
            return switch (count % 10) {
                case 1 -> "минута";
                case 2, 3, 4 -> "минуты";
                default -> "минут";
            };
        } else {
            return "минут";
        }
    }

    private static String getSecondsName(int count) {
        if (count > 0 && count <= 10 || count >= 15 && count <= 59) {
            return switch (count % 10) {
                case 1 -> "секунда";
                case 2, 3, 4 -> "секунды";
                default -> "секунд";
            };
        } else {
            return "секунд";
        }
    }
}