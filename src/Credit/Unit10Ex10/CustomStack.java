package Credit.Unit10Ex10;

import java.util.NoSuchElementException;
import java.util.Stack;

public class CustomStack<K extends Comparable<K>> {
    private final Stack<K> primaryStack;
    private final Stack<K> maxStack;

    public CustomStack() {
        this.primaryStack = new Stack<>();
        this.maxStack = new Stack<>();
    }

    public Stack<K> getMaxStack() {
        return maxStack;
    }

    public void push(K element) {
        primaryStack.push(element);
        if ((maxStack.isEmpty()) || (element.compareTo(maxStack.peek())) >= 0) {
            maxStack.push(element);
        }
    }

    public K pop() {
        try {
            if (primaryStack.peek().equals(maxStack.peek())) {
                maxStack.pop();
            }
            return primaryStack.pop();
        } catch (NoSuchElementException e) {
            System.out.println("The stack is empty");
            return null;
        }
    }

    public K max() {
        return maxStack.peek();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + primaryStack;
    }
}
