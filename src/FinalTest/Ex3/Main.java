package FinalTest.Ex3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private static final String FILENAME = "CarFile.txt";

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            carList.add(new Car("VW", CarModel.getRandomCarModel(), (int) (Math.random() * 3 + 1)));
        }

        Map<Integer, List<Car>> carMap = carList.stream()
                .sorted(Comparator.comparingInt(Car::getEngineCapacity))
                .collect(Collectors.groupingBy(Car::getEngineCapacity));
        createAndWriteFile(carMap, (int) (Math.random() * 3 + 1));
    }

    public static void createAndWriteFile(Map<Integer, List<Car>> carMap, int engineCapacity) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            List<Car> carList = carMap.get(engineCapacity);
            for (Car car : carList) {
                writer.write(car.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
