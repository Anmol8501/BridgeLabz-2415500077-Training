package Functional_Interface.Digital_Payment_Interface;

public class WalletImpl implements IPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet.");
    }
    
}
