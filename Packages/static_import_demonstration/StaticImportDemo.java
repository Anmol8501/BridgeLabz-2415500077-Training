package static_import_demonstration;
import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double a = 9.0, b = -15.5;

        System.out.println("Square root of " + a + " = " + sqrt(a));
        System.out.println("Power (2^3) = " + pow(2, 3));
        System.out.println("Max(10, 20) = " + max(10, 20));
        System.out.println("Min(10, 20) = " + min(10, 20));
        System.out.println("Absolute value of " + b + " = " + abs(b));
    }
}
