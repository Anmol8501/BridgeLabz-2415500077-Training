import java.util.*;
public class oddeven_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        int[] even = new int[n];
        int[] odd = new int[n];
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
               even[i] = numbers[i];
            } else {
                odd[i] = numbers[i];
            }
        }
        System.out.println("Even numbers are: ");
        for (int i= 0; i< even.length; i++) {
            System.out.println(even[i]);
        }
    System.out.println("Odd numbers are: ");
        for (int i= 0; i< odd.length; i++) {
            System.out.println(odd[i]);
        }
        scanner.close();
    }
}

