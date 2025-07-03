package Exam;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        System.out.println(climbTree(a, b, h));
    }

    public static String climbTree(int a, int b, int h) {
        int climbedHeight = 0;
        int day = 0;
        if (a - b <= 0) {
            if (a >= h) {
                day++;
                return "Количество дней: " + day;
            } else {
                return "Невозможно";
            }
        } else {
            while (climbedHeight < h) {
                climbedHeight = climbedHeight + a - b;
                day++;
            }
            return "Количество дней: " + day;
        }
    }
}
