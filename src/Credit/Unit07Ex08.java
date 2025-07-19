package Credit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Unit07Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Pattern regex = Pattern.compile("(?<=\\w)(?=[\\p{Punct}&&[^’'-]])|\\s");
        String[] stringArray = s.split(regex.pattern());

        Pattern regexPunct = Pattern.compile("[\\W]+");
        int maxLength = stringArray[0].length();
        int maxIndex = 0;
        int minLength = stringArray[0].length();
        int minIndex = 0;
        for (int i = 0; i < stringArray.length; i++) {
            Matcher matcher = regexPunct.matcher(stringArray[i]);
            if (!matcher.matches()) {
                if (stringArray[i].length() > maxLength) {
                    maxLength = stringArray[i].length();
                    maxIndex = i;
                } else if (stringArray[i].length() <= minLength) {
                    minLength = stringArray[i].length();
                    minIndex = i;
                }
            }
        }
        String temp = stringArray[maxIndex];
        stringArray[maxIndex] = stringArray[minIndex];
        stringArray[minIndex] = temp;
        StringBuilder builder = new StringBuilder(stringArray[0]);
        for (int i = 1; i < stringArray.length; i++) {
            Matcher matcher = regexPunct.matcher(stringArray[i]);
            if (matcher.matches()) {
                builder.append(stringArray[i]);
            } else {
                builder.append(" ").append(stringArray[i]);
            }
        }
        String result = (builder.toString());
        System.out.println("Результат: " + result);
    }
}