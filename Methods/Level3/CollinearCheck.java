import java.util.Scanner;

public class CollinearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        boolean resultSlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean resultArea = areCollinearArea(x1, y1, x2, y2, x3, y3);

        if (resultSlope && resultArea) {
            System.out.println("Collinear");
        } else {
            System.out.println("Not Collinear");
        }
    }

    static boolean areCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slope1 = (y2 - y1) / (x2 - x1);
        double slope2 = (y3 - y2) / (x3 - x2);
        return Double.compare(slope1, slope2) == 0;
    }

    static boolean areCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}
