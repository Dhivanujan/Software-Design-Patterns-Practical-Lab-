package Task2;
// Main program
public class VehicleDemo {
    public static void main(String[] args) {
        String vehicleType = args.length > 0 ? args[0] : "electric";
        VehicleFactory factory = createFactory(vehicleType);

        // Create vehicles using the factory
        Car car = factory.createCar();
        Bike bike = factory.createBike();

        car.manufacture();
        bike.manufacture();
    }

    private static VehicleFactory createFactory(String vehicleType) {
        if ("electric".equalsIgnoreCase(vehicleType)) {
            return new ElectricVehicleFactory();
        }

        if ("petrol".equalsIgnoreCase(vehicleType)) {
            return new PetrolVehicleFactory();
        }

        System.out.println("Unknown type '" + vehicleType + "'. Defaulting to electric.");
        return new ElectricVehicleFactory();
    }
}
