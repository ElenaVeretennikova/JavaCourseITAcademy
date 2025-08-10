package Exam.Ex6;

public class Pair<K, T> {
    private final K firstElement;
    private final T secondElement;

    public Pair(K firstElement,  T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public K first() {
        return this.firstElement;
    }

    public T second() {
        return this.secondElement;
    }

    public Pair<T, K> swap() {
        return new Pair<>(this.secondElement, this.firstElement);
    }

    public Pair<Object, T> replaceFirst(Object o) {
        return new Pair<>(o, this.secondElement);
    }

    public Pair<K, Object> replaceSecond(Object o) {
        return new Pair<>(this.firstElement, o);
    }

    @Override
    public String toString() {
        return "Элемент 1 = " + firstElement + "; Элемент 2 = " + secondElement;
    }
}
