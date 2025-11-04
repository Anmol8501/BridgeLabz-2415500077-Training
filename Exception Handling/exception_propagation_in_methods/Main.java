package exception_propagation_in_methods;

public class Main {
    static void method1() {
        int result = 10 / 0;  // ArithmeticException
    }

    static void method2() {
        method1();
    }

    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
