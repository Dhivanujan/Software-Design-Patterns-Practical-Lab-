package Task6;
class BikeFactory extends TransportFactory {
    Transport createTransport() {
        return new Bike();
    }
}
