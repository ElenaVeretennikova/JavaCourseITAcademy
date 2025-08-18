package Tests.Test2.Ex11;

public class DoubleCalculator implements Calculator {

    public Double result;

    public DoubleCalculator(Double result) {
        this.result = result;
    }

    public Double getResult() {
        return result;
    }

    @Override
    public void minus(Double doubleNumber) {
        result -= doubleNumber;
    }

    @Override
    public void multiply(Double doubleNumber) {
        result *= doubleNumber;
    }

    @Override
    public void divide(Double doubleNumber) {
        try {
            result /= doubleNumber;
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль низзя");
        }
    }

    @Override
    public void clear() {
        result = 0d;
    }

    @Override
    public void add(Double doubleNumber) {
        result += doubleNumber;
    }
}
