package Credit;

import java.util.Arrays;
import java.util.Scanner;

public class Unit05Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i <n; i++){
            array[i] = (int)(Math.random()*100-50);
            if (array[i] < min){
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Индекс максимального элемента: " + maxIndex);
        System.out.println("Индекс минимального элемента: " + minIndex);
    }
}
