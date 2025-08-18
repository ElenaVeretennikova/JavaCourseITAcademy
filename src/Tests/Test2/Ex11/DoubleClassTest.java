package Tests.Test2.Ex11;

public class DoubleClassTest {
    public static void main(String[] args) {
       DoubleCalculator c = new DoubleCalculator(10d); // getResult() == 10.0
        c.minus(4d);
        c.multiply(3d);
        c.divide(2d);
        c.clear();
        c.add(5d);
        System.out.println(c.getResult());
    }
}
