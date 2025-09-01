package Exam.Ex8;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ex8 {

    private static final String FILE_IN1_PATH = "src/Exam/Ex8/in1.txt";
    private static final String FILE_IN2_PATH = "src/Exam/Ex8/in2.txt";
    private static final String FILE_OUT_PATH = "src/Exam/Ex8/out.txt";
    private static final int NUMBERS_COUNT = 1000;
    private static final int MAX_NUMBER_VALUE = 100000;

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        writeFile(FILE_IN1_PATH);
        writeFile(FILE_IN2_PATH);
        readFile(FILE_IN1_PATH, result);
        readFile(FILE_IN2_PATH, result);
        writeCombinedSortedFile(result, FILE_OUT_PATH);
    }

    public static void writeFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < NUMBERS_COUNT; i++) {
                writer.write(((int) (Math.random() * MAX_NUMBER_VALUE)) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String filename, ArrayList<Integer> resultList) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(filename))) {
            String str;
            while ((str = reader1.readLine()) != null) {
                String[] stringArray1 = str.split("\\s");
                for (String s : stringArray1) {
                    resultList.add(Integer.parseInt(s));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeCombinedSortedFile(ArrayList<Integer> resultList, String targetFileName) {
        try (BufferedWriter bufOut = new BufferedWriter(new FileWriter(targetFileName))) {
            Collections.sort(resultList);
            for (Integer i : resultList) {
                bufOut.write(i + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}