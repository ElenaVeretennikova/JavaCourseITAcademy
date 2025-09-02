package Credit.Unit12Ex11;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Unit12Ex11 {

    private static final String FILENAME = "src/Credit/Unit12Ex11/data.txt";

    public static void main(String[] args) {
        createAndWriteFile(FILENAME);
        calculateAndPrintTextContent(readFile(FILENAME));
    }

    public static void createAndWriteFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Тестовая строка для задания №11: \"Hello! How are you?\" — \"I'm fine, thank you!\" \n");
            writer.write("Вторая тестовая строка");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String filename) {
        String result = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            result = reader.lines().collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void calculateAndPrintTextContent(String text) {
        Pattern regex = Pattern.compile("(?<=\\w)(?=[\\p{Punct}&&[^'-]])|(?<=[\\p{Punct}&&[^'-]])(?=\\w)" +
                "|\\s+|(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)|(?<=[\\p{Punct}&&[^'-]])(?=[\\p{Punct}&&[^'-]])");
        if (text != null) {
            String[] stringArray = text.split(regex.pattern());
            System.out.println(Arrays.toString(stringArray));

            Pattern wordPattern = Pattern.compile("[\\p{L}]+(?:[\\p{L}'’-]+)*");
            Pattern numberPattern = Pattern.compile("\\d+");
            ArrayList<String> wordsList = new ArrayList<>();
            ArrayList<String> numbersList = new ArrayList<>();
            ArrayList<String> punctList = new ArrayList<>();

            for (String s : stringArray) {
                Matcher wordMatcher = wordPattern.matcher(s);
                Matcher numberMatcher = numberPattern.matcher(s);
                if (wordMatcher.matches()) {
                    wordsList.add(s);
                } else if (numberMatcher.matches()) {
                    numbersList.add(s);
                } else {
                    punctList.add(s);
                }
            }

            System.out.println("Количество слов в тексте: " + wordsList.size());
            System.out.println("Количество знаков препинания в тексте: " + punctList.size());
            System.out.println("Количество чисел в тексте: " + numbersList.size());
        } else {
            System.out.println("Файл пуст!");
        }
    }
}
