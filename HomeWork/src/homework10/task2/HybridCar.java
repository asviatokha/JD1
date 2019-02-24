package homework10.task2;

public class HybridCar extends Car {

    private int totalEnginesPower;

    public HybridCar(String brand, String model, Type type, int year, int totalEnginesPower) {
        super(brand, model, type, year);
        this.totalEnginesPower = totalEnginesPower;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 37 + totalEnginesPower;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        HybridCar car = (HybridCar) obj;
        return totalEnginesPower == car.totalEnginesPower;
    }

    @Override
    public String toString() {
        return "HybridCar{" + super.toString() +
                ", totalEnginesPower=" + totalEnginesPower +
                '}';
    }
}