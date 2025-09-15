import java.util.Scanner;
class Quadratic {
    public static double[] findRoots(int a, int b, int c) {
        double delta = b * b - 4 * a * c;
        if (delta > 0) return new double[]{(-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a)};
        else if (delta == 0) return new double[]{-b / (2.0 * a)};
        else return new double[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) System.out.println("No Real Roots");
        else for (double r : roots) System.out.println("Root: " + r);
    }
}
