import java.util.Scanner;

public class multiples{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Validate input
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");

            // Run loop backwards from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        sc.close();
    }
}

