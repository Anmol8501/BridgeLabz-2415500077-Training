package Default_Methods_in_Interfaces.Payment_Gateway_Integration;

public class Main {
    public static void main(String[] args) {
        IPaymentProcessor paypal = new PayPalProcessorImpl();
        paypal.processPayment(100);
        paypal.refund(50); 

        IPaymentProcessor stripe = new StripeProcessorImpl();
        stripe.processPayment(200);
        stripe.refund(100); 
    }
}
