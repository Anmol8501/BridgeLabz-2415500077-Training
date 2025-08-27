import java.util.*;
public class array_until_zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];
        int sum=0;
        for (int i = 0; i < 100; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] == 0) {
                break;
            }
        }
        for (int i = 0; i < 100; i++) {
            sum += numbers[i];
            if (numbers[i] == 0) {
                break;
            }
            System.out.println(numbers[i]);
            
        }
        System.out.println("Sum is: " + sum);
    }
}
