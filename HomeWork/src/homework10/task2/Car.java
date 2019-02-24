package homework10.task2;

public abstract class Car {

    private String make;
    private String model;
    private Type type;
    private int year;

    public Car(String brand, String model, Type type, int year) {
        this.make = brand;
        this.model = model;
        this.type = type;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return make.equals(car.make) &&
                model.equals(car.model) &&
                type == car.type &&
                year == car.year;
    }

    @Override
    public int hashCode() {
        int hash = 37;
        hash = hash * 17 + make.hashCode();
        hash = hash * 17 + model.hashCode();
        hash = hash * 17 + type.hashCode();
        hash = hash * 17 + year;
        return hash;
    }

    @Override
    public String toString() {
        return "make='" + make +
                ", model='" + model +
                ", type=" + type +
                ", year=" + year;
    }
}