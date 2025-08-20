import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height (in inches): ");
        double height = sc.nextDouble();

        // Area formula: 1/2 * base * height
        double areaInInches = 0.5 * base * height;

        // 1 inch = 2.54 cm → 1 inch² = (2.54 * 2.54) cm²
        double areaInCm = areaInInches * 2.54 * 2.54;

        System.out.println("The area of triangle with base " + base + " inches and height " 
                           + height + " inches is:");
        System.out.println(areaInInches + " square inches");
        System.out.println(areaInCm + " square centimeters");

        sc.close();
}
}