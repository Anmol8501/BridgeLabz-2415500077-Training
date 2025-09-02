import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String text) {
        int num = Integer.parseInt(text); // if not number -> exception
        System.out.println(num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // generateException(text);
        handleException(text);
        sc.close();
    }
}
