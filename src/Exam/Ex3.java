package Exam;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int intervalToColumnEdge;
                int intervalToRowEdge;
                if (i < array.length / 2) {
                    intervalToColumnEdge = i;
                } else {
                    intervalToColumnEdge = array.length - i - 1;
                }
                if (j < array[i].length / 2) {
                    intervalToRowEdge = j;
                } else {
                    intervalToRowEdge = n - j - 1;
                }
                if (intervalToColumnEdge == intervalToRowEdge) {
                    array[i][j] = 0;
                } else if (intervalToColumnEdge > intervalToRowEdge) {
                    array[i][j] = (int) (Math.random() * 10 - 11);
                } else {
                    array[i][j] = (int) (Math.random() * 10 + 1);
                }
            }
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }
        int sumOfAll = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                sumOfAll += anInt;
            }
        }
        System.out.println("Суммa всех элементов: " + sumOfAll);
        int sumOfLarger = 0;
        int countOfLarger = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt > sumOfAll) {
                    sumOfLarger += anInt;
                    countOfLarger++;
                }
            }
        }
        if (countOfLarger > 0) {
            double arMean = (double) sumOfLarger / (double) countOfLarger;
            System.out.println("Cреднее арифметическое всех элементов больше " + sumOfAll + " : " + arMean);
        } else {
            System.out.println("Элементы, больше суммы всех элементов отсутствуют");
        }
    }
}
