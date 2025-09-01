import java.util.Scanner;

public class multiples2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Validate input
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 100;

            // Loop backwards from 100 down to 1
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        sc.close();
    }
}

