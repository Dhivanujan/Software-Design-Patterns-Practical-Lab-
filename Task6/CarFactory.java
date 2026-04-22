class CarFactory extends TransportFactory {
    Transport createTransport() {
        return new Car();
    }
}
