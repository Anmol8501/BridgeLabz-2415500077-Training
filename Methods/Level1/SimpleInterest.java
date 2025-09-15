import java.util.Scanner;
class SimpleInterest {
    public static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double si = calculateSI(p, r, t);
        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }
}
