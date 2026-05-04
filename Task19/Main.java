package Task19;

public class Main {
    public static void main(String[] args) {
        Car car = new Stereo(new GPS(new BasicCar()));
        System.out.println(car.features());
    }
}
