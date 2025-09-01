import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;                // max array size
        int[] digits = new int[maxDigit]; // array to store digits
        int index = 0;

        // Step 2: Extract digits and store in array
        while (number != 0) {
            int digit = number % 10;       // get last digit
            digits[index] = digit;         // store in array
            index++;
            number = number / 10;          // remove last digit

            if (index == maxDigit) {       // stop if maxDigit reached
                break;
            }
        }

        // Step 3: Find largest and second largest
        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Step 4: Display results
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second Largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit (all digits same or only one digit).");
        }

        sc.close();
    }
}

