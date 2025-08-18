package Tests.Test2;

import java.util.*;

public class Ex10 {

    public static void main(String[] args) {
    }

    public <K extends Comparable<? super K>> Collection<K> apply(Collection<K> c) {
        List<K> list = new ArrayList<K>(c);
        Collections.sort(list);
        return list;
    }
}