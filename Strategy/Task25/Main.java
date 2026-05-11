package Strategy.Task25;

// Client

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(5000);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(3000);

        cart.setPaymentStrategy(new CashPayment());
        cart.checkout(2000);
    }
}
