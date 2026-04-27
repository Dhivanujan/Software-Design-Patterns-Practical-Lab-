package Task2;
// Concrete Factory - Petrol
public class PetrolVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new PetrolCar();
    }

    @Override
    public Bike createBike() {
        return new PetrolBike();
    }
}
