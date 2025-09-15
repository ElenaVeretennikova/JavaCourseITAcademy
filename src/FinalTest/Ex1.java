package FinalTest;
//Сгенерировать три произвольных целых числа X, Y и Z. Если X больше Z, то вывести на экран сумму X и Y,
// иначе вывести на экран значение Z. Вывести на экран среднее арифметическое этих чисел.

public class Ex1 {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);
        int z = (int) (Math.random() * 100);
        compareInts(x, y, z);
        System.out.println(calculateArithmeticMean(x, y, z));
    }

    public static void compareInts(int x, int y, int z) {
        if (x > z) {
            System.out.println("x + y =  " + (x + y));
        } else {
            System.out.println("z = " + z);
        }
    }

    public static double calculateArithmeticMean(int x, int y, int z) {
        return (double) (x + y + z) / 3;
    }
}
