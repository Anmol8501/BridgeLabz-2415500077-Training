import java.util.Scanner;
class TrigonometricFunctions {
    public static double[] calculate(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{Math.sin(radians), Math.cos(radians), Math.tan(radians)};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double[] res = calculate(angle);
        System.out.println("Sine: " + res[0] + ", Cosine: " + res[1] + ", Tangent: " + res[2]);
    }
}
