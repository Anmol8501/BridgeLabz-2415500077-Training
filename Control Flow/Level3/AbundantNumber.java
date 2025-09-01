import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum = 0
        int sum = 0;

        // Step 3: Loop through divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {   // check divisor
                sum += i;            // add divisor to sum
            }
        }

        // Step 4: Check if abundant
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is NOT an Abundant Number");
        }

        sc.close();
    }
}

