package Credit;

public class Unit04Ex04 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 99999; i++) {
            for (int j = i; j > 0; j /= 10) {
                if (j % 10 == 4 && j % 100 == 13) {
                    count++;
                    break;
                } else if (j % 10 == 4 && j % 100 != 13) {
                    count++;
                    break;
                } else if (j % 10 != 4 && j % 100 == 13) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Нужно исключить " + count + " единиц боевой техники");
    }
}