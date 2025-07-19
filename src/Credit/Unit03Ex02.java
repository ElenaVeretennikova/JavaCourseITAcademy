package Credit;

import java.util.Scanner;

public class Unit03Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        System.out.println(getNextDay(day, month, year));
    }

    public static String getNextDay(int day, int month, int year) {
        if (day == 0 || day > 31 || month == 0 || month > 12) {
            return "Проверьте введенные данные";
        }
        if (day < 28) {
            day++;
        } else {
            if (day == 31) {
                if (isFebruary(month) || is30daysMonth(month)) {
                    return "Проверьте введенные данные";
                }
                if (is31daysMonthExcludeDecember(month)) {
                    day = 1;
                    month++;
                }
                if (isDecember(month)) {
                    day = 1;
                    month = 1;
                    year++;
                }
            }
            if (day == 30) {
                if (isFebruary(month)) {
                    return "Проверьте введенные данные";
                }
                if (is31daysMonthExcludeDecember(month)||isDecember(month)) {
                    day++;
                } else {
                    day = 1;
                    month++;
                }
            }
            if (day == 29) {
                if (!isFebruary(month)) {
                    day++;
                } else {
                    day = 1;
                    month++;
                }
            }
            if (day == 28) {
                if (isFebruary(month)) {
                    if (isLeapYear(year)) {
                        day++;
                    } else {
                        day = 1;
                        month++;
                    }
                } else {
                    day++;
                }
            }
        }
        return "Следующий день: " + day + " " + month + " " + year;
    }

    public static boolean isFebruary(int month) {
        return month == 2;
    }

    public static boolean is30daysMonth(int month) {
        return month == 4 || month == 6 || month == 9 || month == 11;
    }

    public static boolean is31daysMonthExcludeDecember(int month) {
        return month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10;
    }

    public static boolean isDecember(int month) {
        return month == 12;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
}

