package Credit;

import java.util.Scanner;

public class Unit04Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isSimple(number)) {
            System.out.println("Число " + number + " - простое");
        } else {
            System.out.println("Число " + number + " - не простое");
        }
    }

    public static boolean isSimple(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
