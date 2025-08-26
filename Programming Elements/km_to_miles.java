import java.util.*;

public class km_to_miles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter kilometers: ");
        double km = scanner.nextDouble(); // Input kilometers
        
        double miles = km * 1.610
        ; // Correct conversion
        
        System.out.println("The total miles is " + miles + " for the given " + km + " km.");
        
        scanner.close();
    }
}
