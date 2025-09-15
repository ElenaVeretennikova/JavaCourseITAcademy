package FinalTest.Ex3;

import java.io.Serializable;

public class Car implements Serializable {
    private final String name;
    private final CarModel carModel;
    private final int engineCapacity;

    public Car(String name, CarModel carModel, int engineCapacity) {
        this.name = name;
        this.carModel = carModel;
        this.engineCapacity = engineCapacity;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "<" + name + ">" + " : <" + carModel +"> : <" + engineCapacity + ">";
    }
}
