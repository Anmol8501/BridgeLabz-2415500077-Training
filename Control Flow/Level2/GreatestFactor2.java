import java.util.Scanner;

public class GreatestFactor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int greatestFactor = 1; // Initialize
        int counter = number - 1; // Start checking from one less than number

        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break; // stop after finding the greatest factor
            }
            counter--;
        }

        System.out.println("Greatest factor of " + number + " (beside itself) is: " + greatestFactor);
        sc.close();
    }
}
