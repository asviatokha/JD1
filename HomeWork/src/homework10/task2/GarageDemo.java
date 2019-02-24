package homework10.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GarageDemo {

    public static void main(String[] args) {

        Car tesla1 = new ElectricCar("Tesla", "Model 3", Type.SEDAN, 2017, 75, 25);
        Car tesla2 = new ElectricCar("Tesla", "Model 3", Type.SEDAN, 2017, 75, 25);
        Car tesla3 = new ElectricCar("Tesla", "Model 3", Type.SEDAN, 2018, 75, 25);

        Car kiaNiro1 = new HybridCar("Kia", "Niro", Type.CROSSOVER, 2016, 141);
        Car kiaNiro2 = new HybridCar("Kia", "Niro", Type.CROSSOVER, 2017, 141);

        Car volvo1 = new PetrolCar("Volvo", "S60", Type.SEDAN, 2019, 17.8);
        Car volvo2 = new PetrolCar("Volvo", "S60", Type.SEDAN, 2019, 17.8);

        Garage garage = new Garage("My Garage");
        System.out.println(garage.getCars());

        List<Car> cars = new ArrayList<>(Arrays.asList(tesla1, tesla2, tesla3, tesla3, kiaNiro2, volvo1, volvo2));
        for (Car car : cars) {
            garage.park(car);
        }
        System.out.println(garage.getCars());

        garage.exit(tesla1);
        garage.exit(kiaNiro1);
        garage.exit(volvo1);
        garage.exit(volvo1);
        garage.exit(volvo1);

        System.out.println(garage.getCars());
    }
}
