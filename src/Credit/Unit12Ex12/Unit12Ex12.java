package Credit.Unit12Ex12;

//Записать в двоичный файл 30 случайных чисел от 1 до 100. Прочитать записанный файл распечать числа и их среднее арифметическое.

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unit12Ex12 {

    private static final int QUANTITY = 30;
    private static final int MAX_VALUE = 100;
    private static final String FILENAME = "src/Credit/Unit12Ex12/binaryFile.txt";

    public static void main(String[] args) {
        createAndWriteBinaryFile(FILENAME);
        List<String> binaryList = readFile(FILENAME);
        print(binaryList, calculateArithmeticMean(binaryList));
    }

    public static void createAndWriteBinaryFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < QUANTITY; i++) {
                writer.write(Integer.toBinaryString((int) (Math.random() * MAX_VALUE)) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String filename) {
        List<String> resultBinaryList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            StringBuilder incomeText = new StringBuilder();
            String str1;
            while ((str1 = reader.readLine()) != null) {
                incomeText.append(str1);
            }
            resultBinaryList = (Arrays.asList((incomeText.toString()).split("\\s+")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultBinaryList;
    }

    public static double calculateArithmeticMean(List<String> binaryList) {
        int listSum = binaryList.stream()
                .mapToInt(s -> Integer.parseInt(s, 2))
                .sum();
        return (double) listSum / (double) binaryList.size();
    }

    public static void print(List<String> binaryList, double arithmeticMean) {
        System.out.println("Все числа в двоичной системе: " + binaryList);
        System.out.print("Все числа в десятичной системе: ");
        for (String bin : binaryList) {
            System.out.print((Integer.parseInt(bin, 2)) + " ");
        }
        System.out.println();
        System.out.println("Среднне арифметическое всех чисел: " + arithmeticMean);
    }
}
