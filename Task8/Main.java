public class Main {
    public static void main(String[] args) {
        PaymentFactory factory = new PayPalFactory(); // You can switch to CreditCardFactory to test with credit card payment
        Payment payment = factory.createPayment();
        payment.pay();
    }
}
