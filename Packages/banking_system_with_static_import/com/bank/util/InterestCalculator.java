package banking_system_with_static_import.com.bank.util;
import static java.lang.Math.*;

public class InterestCalculator {
    public double calculateSimpleInterest(double P, double R, double T) {
        return (P * R * T) / 100;
    }

    public double calculateCompoundInterest(double P, double R, double T) {
        return P * (pow((1 + R / 100), T)) - P;
    }
}
