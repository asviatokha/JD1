package homework10.task2;

public class PetrolCar extends Car {

    private double tankCapacity;

    public PetrolCar(String brand, String model, Type type, int year, double tankCapacity) {
        super(brand, model, type, year);
        this.tankCapacity = tankCapacity;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 37 + (int) tankCapacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        PetrolCar car = (PetrolCar) obj;
        return Double.compare(car.tankCapacity, tankCapacity) == 0;
    }

    @Override
    public String toString() {
        return "PetrolCar{" + super.toString() +
                ", tankCapacity=" + tankCapacity +
                '}';
    }
}