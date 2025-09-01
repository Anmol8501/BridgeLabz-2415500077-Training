import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Get an integer input and store it in the 'number' variable
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // 2) Define 'sum' (initialize to 0) and 'originalNumber' (copy of input)
        int sum = 0;
        int originalNumber = number;

        // 3) Use a while loop till originalNumber is not equal to zero
        while (originalNumber != 0) {
            // 4) Get the last digit (remainder of modulus operation originalNumber % 10)
            int digit = originalNumber % 10;

            // 5) Find the cube of the digit and add it to 'sum'
            sum += digit * digit * digit;

            // 6) Remove the last digit: find the quotient of originalNumber / 10
            originalNumber = originalNumber / 10;
        }

        // 7) Finally, check if 'number' equals 'sum'
        if (sum == number)

    
            System.out.println(number + " is an Armstrong Number");
        else
            System.out.println(number + " is not an Armstrong Number");
        sc.close();

    }
}
