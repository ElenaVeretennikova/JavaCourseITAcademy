package FinalTest;
//Сгенерировать массив случайных целых чисел, величина которых, по модулю, не превышает 300 (-300 ... 300).
// Число элементов массива равно 10. Найти максимальное и минимальное числа в  массиве и вывести на экран.
// Заменить максимальный элемент на минимальный, умноженный на максимальный.


import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 601 - 300);
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int j = 0; j < array.length; j++) {
            if (array[j] >= max) {
                max = array[j];
                maxIndex = j;
            } else if (array[j] <= min) {
                min = array[j];
                minIndex = j;
            }
        }
        System.out.println("array max value = " + max + "; array min value = " + min);
        int newMaxValue = array[minIndex] * array[maxIndex];
        array[maxIndex] = newMaxValue;
    }
}