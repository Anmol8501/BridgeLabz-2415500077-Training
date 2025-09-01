import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int greatestFactor = 1; // Initialize

        // Loop from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // stop after finding the first (greatest) factor
            }
        }

        System.out.println("Greatest factor of " + number + " (beside itself) is: " + greatestFactor);
        sc.close();
    }
}

