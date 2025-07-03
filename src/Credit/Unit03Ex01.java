package Credit;

import java.util.Scanner;

public class Unit03Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(radiusCheck(a, b, r));
    }

    public static String radiusCheck(int a, int b, int r) {
        double minR = Math.sqrt((Math.pow((double) a / 2, 2) + (Math.pow((double) b / 2, 2))));
            return r >= minR? "Картонка с радиусом " + r + " закрывает полностью отверстие размера " + a + " * " + b:"Картонка с радиусом " + r + " не закрывает полностью отверстие размера " + a + " * " + b;
    }
}
