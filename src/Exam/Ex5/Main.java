package Exam.Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество цветов для составления букета!");
        Scanner scanner = new Scanner(System.in);
        int flowersNumber = scanner.nextInt();
        Bouquet bouquet = new Bouquet(flowersNumber);
        System.out.println("В букете используются следующие цветы: " + bouquet.getFlowers());
        System.out.println("Стоимость букета - " + bouquet.getBouquetPrice() + " BYN");
        System.out.println("Цвета, используемые в букете: " + bouquet.getBouquetColors());
        System.out.println("Букет завянет через " + bouquet.getBouquetLifetime() + " дней");
    }
}
