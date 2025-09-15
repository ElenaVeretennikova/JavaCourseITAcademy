package FinalTest.Ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            carList.add(new Car("VW", CarModel.getRandomCarModel(), (int) (Math.random() * 3 + 1)));
        }

        Map<Integer, List<Car>> carMap = carList.stream()
                .sorted(Comparator.comparingInt(Car::getEngineCapacity))
                .collect(Collectors.groupingBy(Car::getEngineCapacity));

    }
}
