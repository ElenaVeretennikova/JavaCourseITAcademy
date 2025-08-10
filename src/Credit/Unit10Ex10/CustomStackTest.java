package Credit.Unit10Ex10;

public class CustomStackTest {
    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();

        stack.push(8);
        stack.push(9);
        stack.push(99);
        stack.push(77);
        stack.push(-8);
        stack.push(17);
        stack.push(0);
        System.out.println(stack);
        System.out.println(stack.getMaxStack());
        System.out.println(stack.max());
        System.out.println(stack.pop());
        stack.push(100);

        System.out.println(stack.getMaxStack());
        System.out.println(stack.max());
        System.out.println(stack.pop());
        System.out.println(stack.max());
    }
}
