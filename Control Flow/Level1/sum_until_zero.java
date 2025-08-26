import java.util.*;
public class sum_until_zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}
