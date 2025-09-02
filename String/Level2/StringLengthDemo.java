import java.util.Scanner;

public class StringLengthDemo {

    // Method to calculate length without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // when index exceeds, exception will occur
                count++;
            }
        } catch (Exception e) {
            // do nothing, just break when exception occurs
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // user-defined method
        int customLength = getLength(input);

        // built-in method
        int builtInLength = input.length();

        // display results
        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtInLength);
    }
}
