// Main program
public class VehicleDemo {
    public static void main(String[] args) {
        VehicleFactory factory;

        // Simulate factory selection
        String vehicleType = "electric"; // Change to "petrol" to test petrol vehicles

        if(vehicleType.equalsIgnoreCase("electric")) {
            factory = new ElectricVehicleFactory();
        } else {
            factory = new PetrolVehicleFactory();
        }

        // Create vehicles using the factory
        Car car = factory.createCar();
        Bike bike = factory.createBike();

        car.manufacture();
        bike.manufacture();
    }
}