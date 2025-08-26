import java.util.*;
public class height_mesure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height in centimeters: ");
        double heightInCm = scanner.nextDouble(); // Example height in centimeters
        double heightInInches = heightInCm / 2.54; // Convert centimeters to inches (1 inch = 2.54 cm)
        double heightInFeet = heightInInches / 12; // Convert inches to feet (1 foot = 12 inches)

        System.out.println("Height in centimeters: " + heightInCm + " cm");
        System.out.println("Height in inches: " + heightInInches + " inches");
        System.out.println("Height in feet: " + heightInFeet + " feet");
    }
    
}
