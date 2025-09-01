import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Handle negative numbers (convert to positive)
        number = Math.abs(number);

        // Special case: if number is 0, it has 1 digit
        if (number == 0) {
            System.out.println("Number of digits: 1");
            sc.close();
            return;
        }

        // 2) Create count variable
        int count = 0;

        // 3) Loop until number becomes 0
        while (number != 0) {
            // 4) Remove last digit
            number = number / 10;

            count++;
        }

        // 6) Display result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
