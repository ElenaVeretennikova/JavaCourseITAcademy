package Credit;

import java.util.Arrays;
import java.util.Scanner;

public class Unit05Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int)(Math.random()*100-50);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
