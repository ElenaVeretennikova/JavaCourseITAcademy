package Exam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Number of unique words: " + calculateUniqueWords(text));
    }
    public static int calculateUniqueWords(String text){
        Pattern regex = Pattern.compile("[^a-z’'-]");
        text = text.toLowerCase()
                .replaceAll(regex.pattern(), " ")
                .replaceAll("\\s+", " ")
                .trim();
        String[] strings = text.split(" ");
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(strings));
        return uniqueWords.size();
    }
}
