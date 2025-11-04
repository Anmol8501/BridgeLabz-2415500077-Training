package banking_system_with_static_import;

import banking_system_with_static_import.com.bank.util.InterestCalculator;

public class MainApp {
    public static void main(String[] args) {
        InterestCalculator ic = new InterestCalculator();

        double si = ic.calculateSimpleInterest(10000, 5, 2);
        double ci = ic.calculateCompoundInterest(10000, 5, 2);

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
