package homework10.task2;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private String name;
    private Map<Car, Integer> cars;

    public Garage(String name) {
        this.name = name;
        this.cars = new HashMap<>();
    }

    public void park(Car car) {
        this.cars.put(car, this.cars.containsKey(car) ? this.cars.get(car) + 1 : 1);
    }

    public void exit(Car car) {
        if (this.garageHasCar(car)) {
            if (this.getCarNumber(car) > 1) {
                this.cars.put(car, this.cars.get(car) - 1);
            } else {
                this.cars.remove(car);
            }
        }
    }

    public int getCarNumber(Car car) {
        return this.garageHasCar(car) ? this.cars.get(car) : 0;
    }

    public Map<Car, Integer> getCars() {
        return cars;
    }

    private boolean garageHasCar(Car car) {
        return cars.containsKey(car);
    }

    public String getName() {
        return name;
    }
}