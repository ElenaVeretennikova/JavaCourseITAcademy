package Exam;

import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        String[] testArray = new String[]
                {"list", null, "list", "set", "map", "set", "map", "set", "test", "collection", null};
        printMap(arrayToMap(testArray));
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> resultMap = new HashMap<>();
        for (K element : ks) {
            resultMap.put(element, resultMap.getOrDefault(element, 0) + 1);
        }
        return resultMap;
    }

    public static <K> void printMap(Map<K, Integer> map) {
        for (Map.Entry<K, Integer> pair : map.entrySet()) {
            System.out.print(pair.getKey() + ":" + pair.getValue() + " ");
        }
    }
}