class CreditCardFactory extends PaymentFactory {
    Payment createPayment() {
        return new CreditCardPayment();
    }
}