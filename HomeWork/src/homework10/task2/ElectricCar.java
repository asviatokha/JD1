package homework10.task2;

public class ElectricCar extends Car {

    private double capacity;
    private int lifespan;

    public ElectricCar(String brand, String model, Type type, int year, double capacity, int lifespan) {
        super(brand, model, type, year);
        this.capacity = capacity;
        this.lifespan = lifespan;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 37 + (int) capacity + lifespan;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        ElectricCar car = (ElectricCar) obj;
        return Double.compare(car.capacity, capacity) == 0 &&
                lifespan == car.lifespan;
    }

    @Override
    public String toString() {
        return "ElectricCar{" + super.toString() +
                ", capacity=" + capacity +
                ", lifespan=" + lifespan +
                '}';
    }
}