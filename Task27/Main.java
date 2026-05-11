package Task27;

// Client

public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        order.setDeliveryStrategy(new StandardDelivery());
        order.processOrder();

        order.setDeliveryStrategy(new ExpressDelivery());
        order.processOrder();

        order.setDeliveryStrategy(new OvernightDelivery());
        order.processOrder();
    }
}
