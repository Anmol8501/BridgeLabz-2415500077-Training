package Default_Methods_in_Interfaces.Payment_Gateway_Integration;

public class StripeProcessorImpl implements IPaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment via Stripe: $" + amount);
    }

    public void refund(double amount) {
        System.out.println("Refund processed via Stripe: $" + amount);
    }
}
