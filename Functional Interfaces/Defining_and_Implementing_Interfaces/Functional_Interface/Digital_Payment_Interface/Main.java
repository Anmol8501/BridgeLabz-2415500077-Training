package Functional_Interface.Digital_Payment_Interface;

public class Main {
    public static void main(String[] args) {
        IPayment upiPayment = new UPIImpl();
        IPayment walletPayment = new WalletImpl();
        IPayment creditCardPayment = new CreditCardImpl();

        upiPayment.pay(500.0);
        walletPayment.pay(1500.0);
        creditCardPayment.pay(2500.0);
    }
}
