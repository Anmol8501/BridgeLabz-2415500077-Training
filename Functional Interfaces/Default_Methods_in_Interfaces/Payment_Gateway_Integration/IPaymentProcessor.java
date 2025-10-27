package Default_Methods_in_Interfaces.Payment_Gateway_Integration;

public interface IPaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund feature not supported by this payment processor.");
    }
}
