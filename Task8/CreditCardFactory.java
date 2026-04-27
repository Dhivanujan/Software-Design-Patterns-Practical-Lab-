package Task8;
class CreditCardFactory extends PaymentFactory {
    Payment createPayment() {
        return new CreditCardPayment();
    }
}
