import java.util.Objects;

public class PaymentAdapter implements Payment {
    private final PayPal paypal;

    public PaymentAdapter(PayPal paypal) {
        this.paypal = Objects.requireNonNull(paypal, "paypal cannot be null");
    }

    @Override
    public void pay(double amount) {
        paypal.sendPayment(amount);
    }
}
