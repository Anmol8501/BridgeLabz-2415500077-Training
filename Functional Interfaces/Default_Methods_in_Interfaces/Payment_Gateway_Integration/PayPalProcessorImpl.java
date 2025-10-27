package Default_Methods_in_Interfaces.Payment_Gateway_Integration;

public class PayPalProcessorImpl implements IPaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing payment via PayPal: $" + amount);
    }
}
