package Task19;

public class GPS extends CarDecorator {
    public GPS(Car car) {
        super(car);
    }

    public String features() {
        return car.features() + " + GPS";
    }
}
